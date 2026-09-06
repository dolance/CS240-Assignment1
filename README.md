# Assignment 1: Converter and Pixel System

## Description

This assignment contains programs that deal with ASCII values, number bases, and image pixels.

The programs included are:

- ASCII to decimal converter
- Number base converter
- Image to pixel converter
- Pixel to image converter

## Files

- `hw1.java` - Converts characters into decimal ASCII values
- `NumberBaseConverter.java` - Converts between binary, decimal, octal, and hexadecimal
- `hw1.py` - Reads pixel values from `smiley.png` and writes them to `awesome_picture.txt`
- `img2.py` - Reads `awesome_picture.txt` and creates `smiley2.png`

## Requirements

Java programs require JDK 17.

Python programs require Python 3 and Pillow.

To install Pillow:

python -m pip install Pillow

## Running the Programs

For Java programs, compile and run them using Java.

Example:

javac NumberBaseConverter.java

java NumberBaseConverter

For Python programs:

python hw1.py

python img2.py

## Testing

Screenshots of my test cases are located in the `test_evidence` folder.

The number base converter was tested with:

- 45 decimal to hexadecimal
- 0 decimal to binary
- 255 decimal to binary as the largest 8-bit unsigned value
- -3 decimal to binary as an 8-bit two's complement value

## Acknowledgments

Some of the ASCII and image conversion code was provided by the professor during class.

I used ChatGPT 5.6 to help me understand the number base converter, Java radix methods, the 8-bit two's complement test, and general template of a README.