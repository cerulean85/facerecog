import base64
from io import BytesIO

from flask import Flask
import socket
from flask import request
from flask import jsonify
import json

import test
from PIL import Image

app = Flask(__name__)

@app.route('/')
def index():
    return "This is Test Page"

@app.route('/test', methods = ["POST"])
def postJsonHandler():
    params = request.get_json()
    print(params["uuid"])
    print(params["image"])
    print(params["message"])
    print(request.is_json)

    # img_data = bytes(params["image"], encodings="ascii")
    im = Image.open(BytesIO(base64.b64decode(params["image"])))
    im.save("image.jpg")

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

