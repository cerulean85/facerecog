import gc
import time
from multiprocessing import Process

import wrapped_base64
from io import BytesIO
from flask import request
from PIL import Image
# import face_detector
from app import app, db
from face_detector import FaceDetector
from orm import User, UserProfile, UserFace
import test as tt


def get_uuid(uuid):
    return '07d693d4-4f80-4026-9578-54c26fdf906a'
    # return uuid


@app.route('/select_user_info', methods=["POST"])
def select_user_info():
    is_success, error_message = False, None
    user_id, name, profile_img = None, None, None
    try:
        params = request.get_json()
        uuid = get_uuid(params["uuid"])
        user = User.query.filter_by(uuid=uuid).first()
        is_success = user is not None
        if user is None:
            error_message = "Has no user information."
        else:
            user_id = user.id
            name = user.name
            user_profile = UserProfile.query.filter_by(user_id=user_id).first()
            if not user_profile is None:
                profile_img = wrapped_base64.encode_base64(user_profile.profile_img)

    except Exception as e:
        error_message = e
        is_success = False

    return {
        "is_success": is_success,
        "error_message": error_message,
        "user_id": user_id,
        "name": name,
        "profile_img": profile_img
    }


@app.route('/insert_user_info', methods=["POST"])
def insert_user_info():
    is_success, error_message = True, None
    try:
        params = request.get_json()
        uuid = get_uuid(params["uuid"])
        name = params["name"]

        user = User(uuid=uuid, name=name)
        db.session.add(user)
        db.session.flush()
        inserted_id = user.id

        profile_img = wrapped_base64.decode_base64(params["profile_img"])
        user_profile = UserProfile(user_id=inserted_id, profile_img=profile_img)
        db.session.add(user_profile)
        with open("tmp_saved_profile.jpg", "wb") as f:
            f.write(profile_img)

        face_img = wrapped_base64.decode_base64(params["face_img"])
        target_face = wrapped_base64.decode_base64(params["face_img"])
        with open("tmp_saved_face.jpg", "wb") as f:
            f.write(target_face)

        user_face = UserFace(user_id=inserted_id, face_img=face_img)
        db.session.add(user_face)
        db.session.commit()

    except Exception as e:
        error_message = e
        is_success = False

    return {
        "is_success": is_success,
        "error_message": error_message
    }


@app.route('/delete_user_info', methods=["POST"])
def delete_user_info():
    is_success, error_message = True, None
    try:
        params = request.get_json()
        user_id = params["user_id"]

        UserProfile.query.filter_by(user_id=user_id).delete()
        UserFace.query.filter_by(user_id=user_id).delete()
        db.session.commit()

        User.query.filter_by(id=user_id).delete()
        db.session.commit()

    except Exception as e:
        error_message = e
        is_success = False

    return {
        "is_success": is_success,
        "error_message": error_message
    }


@app.route('/update_user_info', methods=["POST"])
def update_user_info():
    is_success, error_message = False, None
    try:
        params = request.get_json()
        user_id = params["user_id"]
        uuid = get_uuid(params["uuid"])
        name = params["name"]

        user = User.query.filter_by(id=user_id).first()
        is_success = user is not None
        if user is None:
            error_message = "Has no user information."
        else:
            user.uuid = uuid
            user.name = name

            profile_img = wrapped_base64.decode_base64(params["profile_img"])
            user_profile = UserProfile.query.filter_by(user_id=user.id).first()
            user_profile.profile_img = profile_img

            face_img = wrapped_base64.decode_base64(params["face_img"])
            user_face = UserFace(user_id=user.id, face_img=face_img)
            db.session.add(user_face)
            db.session.commit()

    except Exception as e:
        error_message = e
        is_success = False

    return {
        "is_success": is_success,
        "error_message": error_message
    }


@app.route('/recognize_face', methods=["POST"])
def recognize_face():
    is_success, error_message = False, None
    similarity, tolerance = 0, 0.6

    try:
        params = request.get_json()
        user_id = params["user_id"]
        face_img = params["face_img"]
        target_face = wrapped_base64.decode_base64(face_img)
        # print("XXX")
        # with open("tmp_saved.jpg", "wb") as f:
        #     f.write(target_face)

        # DB에 있는 모든 Face 이미지 가져오기
        known_faces = []
        searched_faces = UserFace.query.filter_by(user_id=user_id)[:10]

        is_success = len(searched_faces) > 0
        if len(searched_faces) == 0:
            error_message = "Has no images to compare."
        else:
            for face_obj in searched_faces:
                known_faces.append(face_obj.face_img)

            faceDetector = FaceDetector()
            similarity = faceDetector.detect(target_face, known_faces)

            # if similarity < tolerance:
            #     user_face = UserFace(user_id=user_id, face_img=target_face)
            #     db.session.add(user_face)
            #     db.session.commit()

            db.session.flush()
            db.session.close()

            # del faceDetector
            # del known_faces
            # del searched_faces

    except Exception as e:
        error_message = e
        is_success = False
        gc.collect()
        # print(e)

    return {
        "is_success": is_success,
        "similarity": similarity,
        "tolerance": tolerance,
        "error_message": error_message
    }


@app.route('/')
def index():
    return "This is Test Page"


# @app.route('/test', methods=["POST"])
# def postJsonHandler():
#     params = request.get_json()
#     print(params["uuid"])
#     print(params["image"])
#     print(params["message"])
#     print(request.is_json)
#
#     # img_data = bytes(params["image"], encodings="ascii")
#     im = Image.open(BytesIO(base64.b64decode(params["image"])))
#     im.save("zhkim2.jpg")
#
#     return "Success"

@app.route('/pt', methods=["POST"])
def pt():
    params = request.get_json()
    msg = params["msg"]

    return "This is Test Page PT, {}".format(msg)


from socket import socket, AF_INET, SOCK_STREAM


def streaming_process_socket():
    server_socket = socket(AF_INET, SOCK_STREAM)

    ip = "192.168.219.101"
    # 원하는 ip와 port를 설정하고
    port = 5001
    server_socket.bind((ip, port))
    server_socket.listen()

    while True:
        try:
            print("waiting...")
            client_socket, addr = server_socket.accept()
            buffer = ""
            step = 4096
            length = -1
            image_size_str_length = 0
            while True:
                recv_data = client_socket.recv(step)
                data = recv_data.decode('utf-8')
                data_arr = data.split("##")
                if len(data_arr) > 1:
                    length = int(data_arr[0])
                    # image_size_str_length = len(str(image_size))
                    # length = image_size + image_size_str_length + 2
                    print(length)
                    data = data_arr[1]

                buffer += data
                if len(buffer) == length:
                    break
                if len(buffer) < length:
                    step = length - len(buffer)
                    print(len(buffer), length)
                    continue
                # time.sleep(0.5)
            if len(buffer) > 0:
                print("end... {}".format(len(buffer)))
                try:
                    target_face = wrapped_base64.decode_base64(buffer)
                    with open("tmp_saved111.jpg", "wb") as f:
                        f.write(target_face)
                except Exception as e:
                    print(e)

            client_socket.close()
        except Exception as e:
            print(e)

    server_socket.close()


if __name__ == "__main__":
    # test_recognize_face()
    # image_save()

    # p = Process(target=streaming_process_socket, args=())
    # p.start()

    ip = "0.0.0.0"
    port = 5000
    print("Connected Host: {}".format(ip))
    app.run(host=ip, port=port)

# base64.b64decode()
#     print(test.img[0:100])

# message = "Python is fun"
# message_bytes = message.encode('ascii')
# base64_bytes = base64.b64encode(message_bytes)
# base64_message = base64_bytes.decode('ascii')
# print(base64_message)

# with open('logo.png', 'rb') as binary_file:
#     binary_file_data = binary_file.read()
#     base64_encoded_data = base64.b64encode(binary_file_data)
#     base64_message = base64_encoded_data.decode('utf-8')
#
#     print(binary_file_data)

# base64_encoded_data = base64.b64encode(test.img)
# base64_message = base64_encoded_data.decode('utf-8')
