import cv2

img = cv2.imread("image.jpg", cv2.IMREAD_COLOR)
if img is None:
    print("이미지 파일을 읽을 수 없습니다.")
    exit(1)

cv2.namedWindow('Color')
cv2.imshow('Color', img)

cv2.waitKey(0)
cv2.destroyAllWindows()
