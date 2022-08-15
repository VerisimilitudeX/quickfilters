# Color to Grayscale Converter
Simply select your image(s), and it will be converted to grayscale immediately.
## What is an image to grayscale converter?
This software turns color photos into grayscale ones. Only gray color information is left in the output image after it removes all color channel information. You only see a black and white image as a result. There are several methods for removing color from an image, so you can select the conversion algorithm or enter your own constant weights to specify how much grayscale to extract from each color channel.
## How to use this software?
To use this software, you first need to install the `GrayScaleConverter.java` file. There, you can remove the comment from the conversion algorithm you wish to use (or use the default ITU-R BT.709 algorithm). Then, you can select your image(s) and click the `Open` button from the DirectoryResource popup. The software will automatically convert the image to grayscale and save it to the same directory as the original image.
## Algorithms Currently Supported
The following algorithms are currently supported:
- Mean Color Value
- ITU-R BT.709
- IT-R BT.601
- Custom Color Value