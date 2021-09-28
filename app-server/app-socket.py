from flask import Flask, jsonify, render_template, session
from subprocess import call
from flask_socketio import SocketIO, send, emit
# from socket import socket, AF_INET, SOCK_STREAM
import socket

# 접속할 서버 주소입니다. 여기에서는 루프백(loopback) 인터페이스 주소 즉 localhost를 사용합니다.
HOST = '192.168.0.21'
# 클라이언트 접속을 대기하는 포트 번호입니다.
PORT = 5000


# 소켓 객체를 생성합니다.
# 주소 체계(address family)로 IPv4, 소켓 타입으로 TCP 사용합니다.
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


# 포트 사용중이라 연결할 수 없다는
# WinError 10048 에러 해결를 위해 필요합니다.
server_socket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)


# bind 함수는 소켓을 특정 네트워크 인터페이스와 포트 번호에 연결하는데 사용됩니다.
# HOST는 hostname, ip address, 빈 문자열 ""이 될 수 있습니다.
# 빈 문자열이면 모든 네트워크 인터페이스로부터의 접속을 허용합니다.
# PORT는 1-65535 사이의 숫자를 사용할 수 있습니다.
server_socket.bind((HOST, PORT))

# 서버가 클라이언트의 접속을 허용하도록 합니다.
server_socket.listen()

# accept 함수에서 대기하다가 클라이언트가 접속하면 새로운 소켓을 리턴합니다.
client_socket, addr = server_socket.accept()

# 접속한 클라이언트의 주소입니다.
print('Connected by', addr)



# 무한루프를 돌면서
while True:

    # 클라이언트가 보낸 메시지를 수신하기 위해 대기합니다.
    data = client_socket.recv(1024)

    # 빈 문자열을 수신하면 루프를 중지합니다.
    if not data:
        print("Exit")
        break


    # 수신받은 문자열을 출력합니다.
    print('Received from', addr, data.decode())
    data = bytes(data.decode('utf-8')+"ECHO", encoding="utf-8")

    # 받은 문자열을 다시 클라이언트로 전송해줍니다.(에코)
    client_socket.sendall(data)
    print("Really?")


# 소켓을 닫습니다.
client_socket.close()
server_socket.close()

# app = Flask(__name__)
# app.secret_key = "mysecret"
#
# socket_io = SocketIO(app)
#
# # @app.route('/')
# # def hello_world():
# #     return "Hello Gaemigo Project Home Page!!"s
# #
# # @app.route('/chat')
# # def chatting():
# #     return render_template('chat2.html')
# #
#
# @socket_io.on("message")
# def request(message, methods=None):
#     if methods is None:
#         methods = ["GET", "POST"]
#     print("message :  " + message)
#     # socket_io.emit("")
#     # to_client = dict()
#     # if message == 'new_connect':
#     #     to_client['message'] = "새로운 유저가 난입하였다!!"
#     #     to_client['type'] = 'connect'
#     # else:
#     #     to_client['message'] = message
#     #     to_client['type'] = 'normal'
#     #     # emit("response", {'data': message['data'], 'username': session['username']}, broadcast=True)
#     # send(to_client, broadcast=True)
#
# @socket_io.on('connect')
# def connect(message):
#     print("message :  " + message)
#     # emit("response", {'data': 'Connected', 'username': session['username']})
#
#
# if __name__ == '__main__':
#     ip = "192.168.0.21" #socket.gethostbyname(socket.getfqdn())
#     port = 5000
#     socket_io.run(app, debug=True, host=ip, port=port)
#
#
# # import asyncio
# # import websockets
# # import socket
# #
# # async def accept(websocket, path):
# #     while True:
# #         data = await websocket.recv()
# #         print("Received: {}".format(data))
# #
# # if __name__ == "__main__":
# #     ip = "192.168.0.21" #socket.gethostbyname(socket.getfqdn())
# #     port = 5000
# #     start_server = websockets.serve(accept, ip, port)
# #     asyncio.get_event_loop().run_until_complete(start_server)
# #     asyncio.get_event_loop().run_forever()