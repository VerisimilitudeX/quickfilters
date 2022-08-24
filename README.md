# Batch Image Conversion Tools
If you only need to convert one image, using an image editing application that you are already familiar with may be the simplest option. You'd open the image to be converted and then use the application to create a copy of it. But what if you need to convert a large number of images? Opening each image, converting it, and then saving it can be highly time-consuming and tedious. For a few images, this may not be a big deal. But what if you have 1,000 images to work with? To do this by hand would take days, if you could even force yourself to do this repetitive task over and over. This is where these image conversion tools comes in.

## Color to Grayscale Converter
Simply select your images, and they will be batch converted to grayscale instantly, with no loss of image resolution.

![Color to Grayscale Conversion](https://user-images.githubusercontent.com/96280466/184594032-e357db52-7237-467a-961d-8e7067d70d2e.png)

<details>

  <summary>More Info</summary>

### Supported Algorithms
The following algorithms are currently supported:
- Mean Color Value
- ITU-R BT.709
- ITU-R BT.601
- ITU-R BT.2020
- Custom Color Value

### Benefits of Grayscale
You might want to experiment with printing images in grayscale. Grayscale printing is significantly less expensive than color printing. Furthermore, some publications mandate that all images be converted to grayscale. Or perhaps you intend to perform complex image processing. Working with grayscale images could simplify or even speed up that processing.

</details>

## Color to Photographic Negative (Inversion) Converter
Simply select your images, and they will be batch converted to colored inversion instantly, with no loss of image resolution. This is useful for creating negative images or for creating images with a fun aesthetic.

![Color to Colored Inversion Conversion](https://user-images.githubusercontent.com/96280466/184778997-34b0ba60-6998-480c-a4e1-ef50cf6e1bd2.png)

<details>

  <summary>More Info</summary>

### Benefits of Colored Inversion
True color blindness, in which a person cannot discriminate between colors, is exceedingly rare. Red-green weakness is a significantly more frequent illness that affects up to 10% of the male population. People who suffer from it have difficulty distinguishing between red and green, and some colors may appear exactly similar to them.

While it has not been scientifically proven yet (there are varying types and grades of red-green weakness), there is a fair probability that when the colors are inverted, UI components that a red-green weak individual cannot see well will become more distinct.

Simply inverting colors retains the relative contrast between UI components (no black text on grey backgrounds), making it a "safe" effect at the very least.

</details>

## Grayscale to Color Converter
This converter uses the luminosity approach to convert a color image to a grayscale image.

![Grayscale to Color](https://user-images.githubusercontent.com/96280466/184773941-4c9c89e7-c7b1-46c1-9e2a-c36a22fea8da.png)

<details>

  <summary>More Info</summary>

### Usage 
This software converts grayscale photos to color ones. The output image is a color image with the same resolution as the input image. The algorithm used is the luminosity approach. The luminosity is calculated by taking the average of the red, green, and blue color channels. The luminosity is then used to calculate the color of each pixel. The user can also choose to use a different algorithm to calculate the color of each pixel, which is included in the software.

### Supported Algorithms
The following reverse algorithms are currently supported:
- Mean Color Value
- ITU-R BT.709
- ITU-R BT.601
- ITU-R BT.2020
- Custom Color Value

### Benefits
Color images enhance the contrast of the image. They also allow for even more complex image processing than grayscale images.

</details>

## Colored Inversion to Color Converter
Simply select your images, and they will be batch converted to colored inversion instantly, with no loss of image resolution.

![Inverted to Color Conversion](https://user-images.githubusercontent.com/96280466/184777184-388b812b-bbd0-4071-9778-e287e7e250a4.png)

## Installation Instructions
To use this software, you first need download and extract the `ImageConversionTools.jar` or `ImageConversionTools.zip` file. If you don't already have a JDK and/or IDE, please download JDK 11+ and configure it with your IDE. After that, you can run the file of the conversion software you wish to use. Then, select your image(s) and click the `Open` button from the DirectoryResource popup. The software will automatically perform the specified task and save it to the same directory as the original image along with a suffix of the type of conversion performed.

## Algorithm Explanation
1. The user selects a group of images to convert.
2. The conversion algorithm is implemented on each of the selected images.
3. The software saves the results by add a suffix to the end of each image file name, indicating the conversion algorithm used.
6. The user is notified of the result of the conversion.
