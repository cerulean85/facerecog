import base64
from io import BytesIO
from flask import request
from PIL import Image

import face_detector
from app import app, db
from orm import User, UserProfile


@app.route('/')
def index():
    return "This is Test Page"

@app.route('/enroll_user_info', methods = ["POST"])
def enrollUserInfo():

    try:
        params = request.get_json()
        uuid = params["uuid"]
        name = params["name"]

        user = User(uuid=uuid, name=name)
        db.session.add(user)
        db.session.flush()
        inserted_id = user.id

        profile_img = base64.b64decode(params["profile_img"])
        user_profile = UserProfile(user_id=inserted_id, profile_img=profile_img)
        db.session.add(user_profile)

        face_img = face_detector.detect(profile_img)
        user_face = UserProfile(user_id=inserted_id, face_img=profile_img)
        db.session.add(user_face)

        db.session.commit()

        print(params["image"])
        print(params["message"])
        print(request.is_json)
    except:
        return "Failed"

    # img_data = bytes(params["image"], encodings="ascii")
    # im = Image.open(BytesIO(base64.b64decode(params["image"])))
    # im.save("zhkim2.jpg")

    return "Succeed"

@app.route('/test', methods = ["POST"])
def postJsonHandler():
    params = request.get_json()
    print(params["uuid"])
    print(params["image"])
    print(params["message"])
    print(request.is_json)

    # img_data = bytes(params["image"], encodings="ascii")
    im = Image.open(BytesIO(base64.b64decode(params["image"])))
    im.save("zhkim2.jpg")

    return "Success"

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

