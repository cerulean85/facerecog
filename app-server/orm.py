from flask_sqlalchemy import SQLAlchemy

from app import db


class User(db.Model):
    id = db.Column(db.Integer, primary_key=True, nullable=False, autoincrement=True)
    uuid = db.Column(db.Text, nullable=True)
    name = db.Column(db.Text, nullable=True)


class UserProfile(db.Model):
    id = db.Column(db.Integer, primary_key=True, nullable=False, autoincrement=True)
    user_id = db.Column(db.Integer, nullable=False)
    profile_img = db.Column(db.BLOB, nullable=True)


class UserFace(db.Model):
    id = db.Column(db.Integer, primary_key=True, nullable=False, autoincrement=True)
    user_id = db.Column(db.Integer, nullable=False)
    face_img = db.Column(db.BLOB, nullable=True)

# user = User(uuid='kefjkl', name='popop')
# db.session.add(user)
# db.session.flush()
# id = user.id
# print(id)
# db.session.commit()


# result = UserProfile.query.all()
# print("Result: ", result)
# for item in result:
#     print(item.id, item.user_id, item.profile_img)
#
# result = UserFace.query.all()
# for item in result:
#     print(item.id, item.user_id, item.face_img)

# user_info = User.query.filter_by(uuid="tmp_uuid2").first()
# print(user_info)
# is_success = len(user_info) > 0