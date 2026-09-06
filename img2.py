from PIL import Image

def convert(code):
    if code == "R": return (237, 28, 36)
    elif code == "B": return (0, 0, 0)
    elif code == "Y": return (255, 242, 0)
    else: return code

input_text_file = open("awesome_picture.txt", "r")
lines = input_text_file.readlines()
h, w = len(lines), lines[0].count(" ")
img = Image.new(mode="RGB", size=(w, h), color=(0, 0, 0))

for y in range(h):
    pixels = lines[y].split()
    for x in range(w):
        pixel = pixels[x]
        img.putpixel((x, y), convert(pixel))

img.save("smiley2.png")