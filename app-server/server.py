import base64
from io import BytesIO
from flask import request
from PIL import Image

import face_detector
from app import app, db
from orm import User, UserProfile, UserFace


def test():
    p = UserProfile.query.all()

    p.profile_img

@app.route('/select_user_info', methods=["POST"])
def select_user_info():
    is_success, error_message = False, None
    user_id, name, profile_img = None, None, None
    try:
        params = request.get_json()
        uuid = '65100b35-7d31-4001-83e9-734c9de4e55b' #params["uuid"]
        user = User.query.filter_by(uuid=uuid).first()
        is_success = user is not None
        if user is None:
            error_message = "Has no user information."
        else:
            user_id = user.id
            name = user.name
            user_profile = UserProfile.query.filter_by(user_id=user_id).first()
            if not user_profile is None:
                profile_img = encode_base64(user_profile.profile_img)

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
        uuid = params["uuid"]
        name = params["name"]

        user = User(uuid=uuid, name=name)
        db.session.add(user)
        db.session.flush()
        inserted_id = user.id

        profile_img = decode_base64(params["profile_img"])
        user_profile = UserProfile(user_id=inserted_id, profile_img=profile_img)
        db.session.add(user_profile)

        face_img = decode_base64(params["face_img"])
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


@app.route('/update_user_info', methods=["POST"])
def update_user_info():
    is_success, error_message = False, None
    try:
        params = request.get_json()
        user_id = params["user_id"]
        uuid = params["uuid"]
        name = params["name"]

        user = User.query.filter_by(id=user_id).first()
        is_success = user is not None
        if user is None:
            error_message = "Has no user information."
        else:
            user.uuid = uuid
            user.name = name

            profile_img = decode_base64(params["profile_img"])
            user_profile = UserProfile.query.filter_by(user_id=user.id).first()
            user_profile.profile_img = profile_img

            face_img = decode_base64(params["face_img"])
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
    is_success, error_message = None, False
    similarity = 0
    try:
        params = request.get_json()
        user_id = params["user_id"]
        target_face = decode_base64(params["face_img"])

        # DB에 있는 모든 Face 이미지 가져오기
        known_faces = []
        searched_faces = UserProfile.query.filter_by(user_id=user_id)[:10]
        is_success = len(searched_faces) > 0
        if len(searched_faces) == 0:
            error_message = "Has no images to compare."
        else:
            for face_img in searched_faces:
                known_faces.append(face_img)

            similarity = face_detector.detect(target_face, known_faces)

            if similarity < face_detector.tolerance:
                user_face = UserFace(user_id=user_id, face_img=target_face)
                db.session.add(user_face)
                db.session.commit()

    except Exception as e:
        error_message = e
        is_success = False

    return {
        "is_success": is_success,
        "similarity": similarity,
        "tolerance": face_detector.tolerance,
        "error_message": error_message
    }


def encode_base64(image):
    result = None
    try:
        result = base64.b64encode(image).decode("utf-8")
    except Exception as e:
        pass

    return result


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

def decode_base64(image):
    result = None
    try:
        result = base64.b64decode(image)
    except Exception as e:
        pass

    return result


if __name__ == "__main__":
    ip = "0.0.0.0"
    port = 5000
    print("Connected Host: {}".format(ip))
    app.run(host=ip, port=port, debug=True)

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
