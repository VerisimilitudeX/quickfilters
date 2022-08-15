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

## Benefits of Converting to Grayscale

### Color complexity
We all recognize color with ease and if you ask anyone it doesn’t take much effort to distinguish one color from another. When it comes to image processing, however, you’ll either want to go down the traditional route and control the camera’s color calibration, brightness, contrast, lighting, and other factors or simply convert it into grayscale which will at least make your life much easier. Of course, this doesn’t apply to editors who necessarily need colors in their image.

### Easier learning of Image Processing
For people who have even the slightest experience in image processing, this will sound unnecessary but it’s actually recommended that you first understand grayscale (single-channel processing) and how it applies to multi-channel processing (e.g. RGB) before going deeper into editing colored images. 

### Easier visualization
In grayscale images, you can easily objectify the algorithm since the 3D image of houses, valleys, and hills are created by only 2 spatial dimensions and one brightness dimension. In such an image, the “peak brightness” is just the mountain peak so you can see how much easier it is to solve a problem in Grayscale. On the other hand, in RGB, HSI, and other color spectrums, this visualization is way harder since there are extra dimensions that can’t be easily visualized by the human brain. I mean we can think of “peak greenness” for sure but what does that valley look like in color space? At the end of the day, we’ll eventually end up right back to using a grayscale image instead.

### Noise reduction
This one is mostly for applications of image processing since color information doesn’t help the algorithm identify all the important edges (changes in pixel value) or other features that the image might have. However, the are some exceptions. For instance, if there is an edge in hue that is harder to detect in grayscale, or if we need to identify objects of already known hue, then using color could be the key to success. 

### Code complexity
If you want to find edges based on brightness and coloring, you have a lot of work ahead of you. The complexity of the code will substantially increase and will require additional support, debugging and more. Doing the same in grayscale is much easier.

### Speed
Modern computers can do parallel programming and process a megapixel image in just milliseconds. More complicated tasks like facial recognition, OCR, resizing, etc… will obviously take much longer but you get my point. Whatever time is required to process the image or just get some information out of it, most users want to be done as fast as possible. Now if we are working on a single image and we process it in a triple channel such as RGB, it takes about 3 times longer than in Grayscale. Now, this won’t be an issue if you process a few photos but imagine doing the same in a database of hundreds or thousands of images. It’s important to save as much time as possible since nobody wants their computer to run an analysis for 24 hours straight when you can avoid it by removing color channels, resizing the images, etc…
