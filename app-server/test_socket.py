import time
from socket import socket, AF_INET, SOCK_STREAM

import wrapped_base64
from app import db
from face_detector import FaceDetector
from orm import UserFace


# def recognize_face():
#     is_success, error_message = False, None
#     similarity, tolerance = 0, 0.6
#
#     try:
#         params = request.get_json()
#         print("이것 다음121212")
#         user_id = params["user_id"]
#         print("이것 다음??")
#         target_face = wrapped_base64.decode_base64(params["face_img"])
#         # print("XXX")
#         # with open("tmp_saved.jpg", "wb") as f:
#         #     f.write(target_face)
#
#         # DB에 있는 모든 Face 이미지 가져오기
#         known_faces = []
#         searched_faces = UserFace.query.filter_by(user_id=user_id)[:10]
#         is_success = len(searched_faces) > 0
#         if len(searched_faces) == 0:
#             error_message = "Has no images to compare."
#         else:
#             for face_obj in searched_faces:
#                 known_faces.append(face_obj.face_img)
#
#             faceDetector = FaceDetector()
#             print("여긴가?111")
#             similarity = faceDetector.detect(target_face, known_faces)
#             print("여긴가?222")
#
#             if similarity < tolerance:
#                 user_face = UserFace(user_id=user_id, face_img=target_face)
#                 db.session.add(user_face)
#                 db.session.commit()
#
#     except Exception as e:
#         error_message = e
#         is_success = False
#         print(e, "우웩")
#
#     return {
#         "is_success": is_success,
#         "similarity": similarity,
#         "tolerance": tolerance,
#         "error_message": error_message
#     }

server_socket = socket(AF_INET, SOCK_STREAM)
# 서버 소켓을 만듭니다.

ip = "192.168.219.101"
# 원하는 ip와 port를 설정하고
port = 5003
server_socket.bind((ip, port))
server_socket.listen()

while True:
    try:
        print("waiting...")
        client_socket, addr = server_socket.accept()
        image_bytes = ""
        while True:
            recv_data = client_socket.recv(300000)
            if not recv_data:
                print("END!!!")
                break

            # print(recv_data)
            data = recv_data.decode('utf-8')
            image_bytes += data
            print(len(image_bytes))
            # client_socket.send(data.encode('utf-8'))
            # print("data_length: {}".format(len(data)))
            # print(data)
            # split_data = data.split('\n')
            # # user_id = split_data[0]
            # stream_data = ""
            # for sd in split_data:
            #     print(sd)
            #     stream_data += sd
            #
            # # print(len(stream_data))
            # # print("user_id: {}".format(user_id))
            # # print("stream_data: {}".format(stream_data))
            # print("stream_data_length: {}".format(len(stream_data)))

            # if len(data) == 0:
            #     continue
            #
        if len(image_bytes) > 0:
            print("end... {}".format(len(image_bytes)))
            target_face = wrapped_base64.decode_base64(image_bytes)
            with open("tmp_saved111.jpg", "wb") as f:
                f.write(target_face)


            # data1 = "xxxx1" + data
            # # data2 = data + "aaaa2"
            # # data3 = data + "bbbb3"
            # print(data1)


    # client_socket.send(data2.encode('utf-8'))
    # client_socket.send(data3.encode('utf-8'))
    except Exception as e:
        print(e)

client_socket.close()
server_socket.close()
# time.sleep(3)
# client_socket.recv(1024).decode('utf-8')

# client_socket.close()

# import socket
#
# # 통신 정보 설정
# IP = "192.168.219.101"
# PORT = 5001
# SIZE = 1024
# ADDR = (IP, PORT)
#
#
# server = socket.socket()
# server.bind((IP, PORT))
# server.listen(1)
# client, addr = server.accept()
# msg = client.recv(1024)
# msg_str = msg.decode('utf-8') + "xxxx"
# msg_bytes = bytes(msg_str, 'utf-8')
# print(msg_str)
# # client.sendall(msg_bytes)
# client.send(msg_str.encode("utf-8"))
# client.close()
# server.close()
# # 서버 소켓 설정
# # with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server_socket:
# #     server_socket.bind(ADDR)  # 주소 바인딩
# #     server_socket.listen()  # 클라이언트의 요청을 받을 준비
# #
# #     # 무한루프 진입
# #     while True:
# #         client_socket, client_addr = server_socket.accept()  # 수신대기, 접속한 클라이언트 정보 (소켓, 주소) 반환
# #         msg = client_socket.recv(SIZE)  # 클라이언트가 보낸 메시지 반환
# #         print("[{}] message : {}".format(client_addr,msg))  # 클라이언트가 보낸 메시지 출력
# #
# #         client_socket.sendall("welcome!".encode())  # 클라이언트에게 응답
# #
# #         client_socket.close()  # 클라이언트 소켓 종료