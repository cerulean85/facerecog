import base64

def decode_base64(image):
    result = None
    try:
        result = base64.b64decode(image)
    except Exception as e:
        pass

    return result

def encode_base64(image):
    result = None
    try:
        result = base64.b64encode(image).decode("utf-8")
    except Exception as e:
        pass

    return result