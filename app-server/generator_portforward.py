


# with open('portforward.cfg', 'r', encoding='utf-8') as f:
#
#     lines = f.readlines()
#     for line in lines:
#         print(line.replace('\n', ''))


with open('portforward2.cfg', "w", encoding="utf-8") as f:
    f.write("Type=portforward # Do not modify\n" +
            "Version=1.0.0 # Do not modify\n" +
            "lang=utf-8 # Do not modify\n\n")

    for index in range(1, 256):
        f.write("[사이트{}]\n".format(index) +
                "enable=1\n" +
                "{\n" +
                "protocol=tcp\n" +
                "extern_port=5000-5000\n" +
                "local_port=5000-5000\n" +
                "local_ip=192.168.0.{}\n".format(index) +
                "}\n\n")