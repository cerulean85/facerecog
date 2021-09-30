import cv2
import numpy as np
import face_recognition

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

# cv2.rectangle(imgZHKim1, (faceLoc[3], faceLoc[0]), (faceLoc[1], faceLoc[2]), (255, 0, 255), 2)

# cv2.imshow("ZHKim", imgZHKim1)
# cv2.waitKey(0)

# img = cv2.imread("zhkim1.jpg", cv2.IMREAD_COLOR)
# if img is None:
#     print("이미지 파일을 읽을 수 없습니다.")
#     exit(1)
#
# cv2.namedWindow('Color')
# cv2.imshow('Color', img)
#
# cv2.waitKey(0)
# cv2.destroyAllWindows()
