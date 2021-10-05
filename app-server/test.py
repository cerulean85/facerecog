import io

import PIL
import numpy as np

from face_detector import FaceDetector
from orm import UserFace
import face_recognition
import cv2
from app import app, db

tmp_uuid = '65100b35-7d31-4001-83e9-734c9de4e55b'

def profile_save():
    known_faces = []
    searched_profiles = UserFace.query.filter_by(user_id=26)[:10]
    is_success = len(searched_profiles) > 0
    if len(searched_profiles) == 0:
        error_message = "Has no images to compare."
    else:
        count = 1
        for face_obj in searched_profiles:
            print(face_obj.face_img)
            with open("tmp_saved_profile" + str(count) + ".jpg", "wb") as f:
                f.write(face_obj.face_img)

def face_save():
    known_faces = []
    searched_faces = UserFace.query.filter_by(user_id=26)[:10]
    is_success = len(searched_faces) > 0
    if len(searched_faces) == 0:
        error_message = "Has no images to compare."
    else:
        count = 1
        for face_obj in searched_faces:
            print(face_obj.face_img)
            with open("tmp_saved" + str(count) + ".jpg", "wb") as f:
                f.write(face_obj.face_img)


def test_encode():
    img = face_recognition.load_image_file("tmp_saved.jpg")
    img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
    faceLoc = face_recognition.face_locations(img)[0]
    result = face_recognition.face_encodings(img)[0]
    return result


def _detect():
    imgBillGates = face_recognition.load_image_file('billGates.jpg')
    imgZHKim1 = face_recognition.load_image_file('zhkim1.jpg')
    imgZHKim2 = face_recognition.load_image_file('zhkim2.jpg')

    imgBillGates = cv2.cvtColor(imgBillGates, cv2.COLOR_BGR2RGB)
    imgZHKim1 = cv2.cvtColor(imgZHKim1, cv2.COLOR_BGR2RGB)
    imgZHKim2 = cv2.cvtColor(imgZHKim2, cv2.COLOR_BGR2RGB)

    faceLocBillGates = face_recognition.face_locations(imgBillGates)[0]
    faceLocZHKim1 = face_recognition.face_locations(imgZHKim1)[0]
    faceLocZHKim2 = face_recognition.face_locations(imgZHKim2)[0]

    encoderBillGates = face_recognition.face_encodings(imgBillGates)[0]
    encoderZHKim1 = face_recognition.face_encodings(imgZHKim1)[0]
    encoderZHKim2 = face_recognition.face_encodings(imgZHKim2)[0]


    # result1 = face_recognition.compare_faces([encoderZHKim1], encoderZHKim2)
    # result2 = face_recognition.compare_faces([encoderZHKim1], encoderBillGates)
    # 유사도로 결과 확인. 유사할수록 값이 낮게 나옴!!
    result1 = face_recognition.face_distance([encoderZHKim1], encoderZHKim2)
    result2 = face_recognition.face_distance([encoderZHKim1], encoderBillGates)
    print(result1, result2)


def test_detect(target_face, known_faces):
    # encoded_target_face = test_get_encoded_face_to_filename(target_face)
    encoded_known_faces = []
    for face in known_faces:
        faceDetector = FaceDetector()
        encoded_known_faces.append(faceDetector.get_encoded_face_by_numpy(face))

    result = face_recognition.face_distance(encoded_known_faces, target_face)
    max_result = max(result)
    return max_result

def test_get_encoded_face_to_filename(filename):
    image = face_recognition.load_image_file(filename)
    converted_image = cv2.cvtColor(image, cv2.COLOR_BGR2RGB)
    encodings = face_recognition.face_encodings(converted_image)
    return encodings[0]

def test_recognize_face():
    user_id = 69 #params["user_id"]

    # DB에 있는 모든 Face 이미지 가져오기
    known_faces = []
    searched_faces = UserFace.query.filter_by(user_id=user_id)[:10]
    is_success = len(searched_faces) > 0
    if len(searched_faces) == 0:
        error_message = "Has no images to compare."
    else:
        encoding = test_get_encoded_face_to_filename("tmp_saved_face.jpg")
        target_face = encoding
        for face_obj in searched_faces:
            known_faces.append(face_obj.face_img)

        similarity = test_detect(target_face, known_faces)
        print(similarity)

# test_recognize_face()
# _detect()