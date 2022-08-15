# Color to Grayscale Converter
Simply select your image(s), and it will be converted to grayscale immediately.

![Untitled design](https://user-images.githubusercontent.com/96280466/184594032-e357db52-7237-467a-961d-8e7067d70d2e.png)

## Usage 
This software turns color photos into grayscale ones. Only gray color information is left in the output image after it removes all color channel information. You only see a black and white image as a result. There are several methods for removing color from an image, so you can select the conversion algorithm or enter your own constant weights to specify how much grayscale to extract from each color channel.

## Installation Instructions
To use this software, you first need to install the `GrayScaleConverter.java` file. There, you can remove the comment from the conversion algorithm you wish to use (or use the default ITU-R BT.709 algorithm). Then, you can select your image(s) and click the `Open` button from the DirectoryResource popup. The software will automatically convert the image to grayscale and save it to the same directory as the original image.

## Algorithms Currently Supported
The following algorithms are currently supported:
- Mean Color Value
- ITU-R BT.709
- ITU-R BT.601
- Custom Color Value

## Benefits of Grayscale

### Color complexity
We all recognize color easily, and asking anyone will reveal that distinguishing one color from another does not require much effort. When it comes to image processing, you can either go the traditional route and control the camera's color calibration, brightness, contrast, lighting, and other factors, or you can simply convert it to grayscale, to simplify the process.

### Easier visualization
The algorithm is easily visible in grayscale images because the 3D image of houses, valleys, and hills is created by only two spatial dimensions and one brightness dimension. In this case, the "peak brightness" is simply the mountain peak, demonstrating how much easier it is to solve a problem in Grayscale. However, in RGB, HSI, and other color spectrums, this visualization is much more difficult because there are extra dimensions that the human brain cannot easily visualize. Sure, we can think of "peak greenness," but how does that valley look in color space? At the end of the day, we'll be right back to using a grayscale image.

### Noise reduction
Color information does not help the algorithm identify all of the important edges (changes in pixel value) or other features that the image may have, so this one is mostly for image processing applications.

### Code complexity
You have a lot of work ahead of you if you want to find edges based on brightness and coloring. The code's complexity will skyrocket, necessitating additional support, debugging, and other efforts. It is much easier to do the same thing in grayscale.

### Speed
Modern computers are capable of parallel processing and can process megapixel images in milliseconds. More complex tasks, such as facial recognition, OCR, resizing, and so on, will obviously take much longer, but you get the idea. Whatever time it takes to process the image or extract information from it, most users want to be done as soon as possible. Now, if we work on a single image and process it in a triple channel, such as RGB, it takes about three times as long as it does in Grayscale. This isn't a problem if you're only processing a few photos, but imagine doing the same in a database with hundreds or thousands of images.I t is critical to save as much time as possible because no one wants their computer to run an analysis for 24 hours straight when it can be avoided by removing color channels, resizing images, and so on.
