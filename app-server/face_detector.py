import gc
import io
import PIL
import cv2
import numpy as np
import face_recognition



class FaceDetector:

    def detect(self, target_face_bytes, known_faces_bytes):

        similarities = []
        try:
            encoded_target_face = self.get_encoded_face_by_numpy(target_face_bytes)
            encoded_known_faces = []
            for face in known_faces_bytes:
                try:
                    arr0 = self.get_encoded_face_by_numpy(face)
                    similarity = face_recognition.face_distance([arr0], encoded_target_face)[0]
                except Exception as e:
                    similarity = 1.0

                similarities.append(similarity)

            del encoded_target_face

        except Exception as e:
            print("에러!!", e)
            similarities = [-1]
            gc.collect()

        result = min(similarities)
        return result

    def get_encoded_face_by_numpy(self, src):
        image = PIL.Image.open(io.BytesIO(src))
        image_np = np.array(image)
        converted_image = cv2.cvtColor(image_np, cv2.COLOR_BGR2RGB)
        encodings = face_recognition.face_encodings(converted_image)
        return encodings[0]
