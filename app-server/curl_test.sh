#!/bin/bash

curl -X POST -H "Content-Type: application/json; charset=utf-8" -d '{"msg":"TEST"}' http://localhost:5000/pt &&
echo "" &&
curl -X POST -H "Content-Type: application/json; charset=utf-8" \
-d '{"uuid":"tmp_uuid"}' http://localhost:5000/select_user_info &&
echo ""

curl -X POST -H "Content-Type: application/json; charset=utf-8" -d '{"uuid":"tmp_uuid3", "name":"zhkim3", "profile_img":"blah", "face_img":"blah"}' http://localhost:5000/insert_user_info &&
echo "" &&

curl -X POST -H "Content-Type: application/json; charset=utf-8" -d '{"user_id":21, "uuid":"tmp_uuid_update", "name":"zhkim33333", "profile_img":"cvbblah", "face_img":"werwerblah"}' http://localhost:5000/update_user_info &&
echo ""
