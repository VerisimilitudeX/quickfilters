# Image Conversion Tools

## Color to Grayscale Converter
Simply select your images, and they will be batch converted to grayscale instantly, with no loss of image resolution.

![Color to Grayscale Diagram](https://user-images.githubusercontent.com/96280466/184594032-e357db52-7237-467a-961d-8e7067d70d2e.png)

### Unique Features
If you only need to convert one image to grayscale, using image editing application that you are already familiar with may be the simplest option. You'd open the image to be converted and then use the application to create a grayscale copy of it. But what if you need to grayscale a large number of images? Opening each image, converting it to grayscale, and then saving it can be time-consuming and tedious. For a few images, this may not be a big deal. But what if you have 1,000 images to work with? To do this by hand would take days, if you could even force yourself to do this repetitive task over and over. This is where this software (Color to Grayscale Converter) comes in.

### Usage 
This software turns color photos into grayscale ones. Only gray color information is left in the output image after it removes all color channel information. You only see a black and white image as a result. There are several methods for removing color from an image, so you can select the conversion algorithm or enter your own constant weights to specify how much grayscale to extract from each color channel.

### Installation Instructions
To use this software, you first need to install the `GrayScaleConverter.java` file. There, you can remove the comment from the conversion algorithm you wish to use (or use the default ITU-R BT.709 algorithm). Then, you can select your image(s) and click the `Open` button from the DirectoryResource popup. The software will automatically convert the image to grayscale and save it to the same directory as the original image.

### Algorithms Currently Supported
The following algorithms are currently supported:
- Mean Color Value
- ITU-R BT.709
- ITU-R BT.601
- ITU-R BT.2020
- Custom Color Value

### Benefits of Grayscale
You might want to experiment with printing images in grayscale. Grayscale printing is significantly less expensive than color printing. Furthermore, some publications mandate that all images be converted to grayscale. Or perhaps you intend to perform more complex image processing. Working with grayscale images could simplify or even speed up that processing.

### How it Works
1. The user selects a group of images to convert.
2. The grayscale conversion algorithm is implemented on each of the selected images.
3. The software saves the results by add a -gray suffix to the end of each image file name.
6. The user is notified of the result of the conversion.

### Installation Instructions
To use this software, you first need to install the `GrayScaleConverter.java` file. There, you can remove the comment from the conversion algorithm you wish to use (or use the default ITU-R BT.709 algorithm). Then, you can select your image(s) and click the `Open` button from the DirectoryResource popup. The software will automatically convert the image to grayscale and save it to the same directory as the original image.
