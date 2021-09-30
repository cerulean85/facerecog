from flask import Flask
from flask_sqlalchemy import SQLAlchemy
app = Flask(__name__)

db_conn_info = {
    "user": "zhkim",
    "password": "12345678",
    "host": "15.165.101.124",
    "port": 3306,
    "database": "facerecog"
}

db_url = f"mysql+mysqlconnector://{db_conn_info['user']}:{db_conn_info['password']}@" \
         f"{db_conn_info['host']}:{db_conn_info['port']}/{db_conn_info['database']}?charset=utf8"

app.config['SQLALCHEMY_DATABASE_URI'] = db_url
app.config['SQLALCHEMY_ECHO'] = True
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = True

db = SQLAlchemy(app)