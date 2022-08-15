/**
 * Create a gray scale version of an image by setting all color components of each pixel to the same value.
 * 
 * @author Duke Software Team 
 */
import resources.*;
import java.io.*;

public class GrayScaleConverter {
	//I started with the image I wanted (inImage)
	public static ImageResource makeGray(ImageResource colorImage) {
		//I made a blank image of the same size
		ImageResource grayImage = new ImageResource(colorImage);
		//for each pixel in outImage
		for (Pixel p : grayImage.pixels()) {
			//look at the corresponding pixel in inImage
			Pixel corrPixel = colorImage.getPixel(p.getX(), p.getY());
			//compute inPixel's red + inPixel's blue + inPixel's green
			//divide that sum by 3 (call it average)
			int avg = (corrPixel.getRed() + corrPixel.getGreen() + corrPixel.getGreen()) / 3;
			//set pixel's red to average
			p.setRed(avg);
			//set pixel's green to average
			p.setGreen(avg);
			//set pixel's blue to average
			p.setBlue(avg);
		}
		//outImage is your answer
		return grayImage;
	}

	public static void main(String[] args) {
		DirectoryResource dr = new DirectoryResource();
		for (File f : dr.selectedFiles()) {
			ImageResource inImage = new ImageResource(f);
			ImageResource gray = makeGray(inImage);
			String filename = gray.getFileName();
			// set the new name to the filename's substring without the file extension
			gray.setFileName(filename.substring(0, filename.indexOf(".")) + "-gray.jpg");
			gray.save();
		}
	}
}
