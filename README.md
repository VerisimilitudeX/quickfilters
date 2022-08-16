# Image Conversion Tools

## Color to Grayscale Converter
Simply select your images, and they will be batch converted to grayscale instantly, with no loss of image resolution.

![Color to Grayscale Diagram](https://user-images.githubusercontent.com/96280466/184594032-e357db52-7237-467a-961d-8e7067d70d2e.png)

<details>

  <summary>More Info</summary>

### Usage 
This software turns color photos into grayscale ones. Only gray color information is left in the output image after it removes all color channel information. You only see a black and white image as a result. There are several methods for removing color from an image, so you can select the conversion algorithm or enter your own constant weights to specify how much grayscale to extract from each color channel.

### Algorithms Currently Supported
The following algorithms are currently supported:
- Mean Color Value
- ITU-R BT.709
- ITU-R BT.601
- ITU-R BT.2020
- Custom Color Value

### Benefits of Grayscale
You might want to experiment with printing images in grayscale. Grayscale printing is significantly less expensive than color printing. Furthermore, some publications mandate that all images be converted to grayscale. Or perhaps you intend to perform complex image processing. Working with grayscale images could simplify or even speed up that processing.

</details>

## Grayscale to Color Converter
This converter uses the luminosity approach to convert a color image to a grayscale image.

![Grayscale to Color Diagram](https://user-images.githubusercontent.com/96280466/184594033-e357db52-7237-467a-961d-8e7067d70d2e.png)

<details>

  <summary>More Info</summary>

### Usage 
This software converts grayscale photos to color ones. The output image is a color image with the same resolution as the input image. The algorithm used is the luminosity approach. The luminosity is calculated by taking the average of the red, green, and blue color channels. The luminosity is then used to calculate the color of each pixel. The user can also choose to use a different algorithm to calculate the color of each pixel, which is included in the software.

### Algorithms Currently Supported
The following reverse algorithms are currently supported:
- Mean Color Value
- ITU-R BT.709
- ITU-R BT.601
- ITU-R BT.2020
- Custom Color Value

### Benefits
Color images enhance the contrast of the image. They also allow for even more complex image processing than grayscale images.

</details>
















### Unique Features
If you only need to convert one image, using an image editing application that you are already familiar with may be the simplest option. You'd open the image to be converted and then use the application to create a copy of it. But what if you need to convert a large number of images? Opening each image, converting it, and then saving it can be highly time-consuming and tedious. For a few images, this may not be a big deal. But what if you have 1,000 images to work with? To do this by hand would take days, if you could even force yourself to do this repetitive task over and over. This is where these image conversion tools comes in.

### Installation Instructions
To use this software, you first need download and extract the `ImageConversionTools_.jar_` or `ImageConversionTools_.zip_` file. There, you can run the conversion software you wish to use. Then, you can select your image(s) and click the `Open` button from the DirectoryResource popup. The software will automatically perform the task and save it to the same directory as the original image.

### How They Work
1. The user selects a group of images to convert.
2. The conversion algorithm is implemented on each of the selected images.
3. The software saves the results by add a suffix to the end of each image file name, indicating the conversion algorithm used.
6. The user is notified of the result of the conversion.