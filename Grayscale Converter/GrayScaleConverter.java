import resources.*;
import java.io.*;

public class GrayScaleConverter {
	public static ImageResource makeGray(ImageResource colorImage) {
		ImageResource grayImage = new ImageResource(colorImage);
		for (Pixel p : grayImage.pixels()) {
			Pixel corrPixel = colorImage.getPixel(p.getX(), p.getY());
			
			/* -------------------------------------------------
			 * Algorithms to convert color to grayscale
			 * Remove the comment for the algorithm you want to use (and comment out the others)
			 * The default is to use the ITU-R BT.709 algorithm
			 * -------------------------------------------------
			*/

				// ***Average Color Values***
			// int newRGB = (corrPixel.getRed() + corrPixel.getGreen() + corrPixel.getGreen()) / 3;
				// ***ITU-R BT.709 Formula***
			int newRGB = (int) ((0.2126 * corrPixel.getRed()) + (0.7152 * corrPixel.getGreen()) + (0.0722 * corrPixel.getBlue()));
				// ***ITU-R BT.601 Formula***
			// int newRGB = (int) ((0.299 * corrPixel.getRed()) + (0.587 * corrPixel.getGreen()) + (0.114 * corrPixel.getBlue()));
				// ***Custom Formula***
			// int newRGB = (int) ((/* Red weight * */ corrPixel.getRed()) + (/* Green weight * */ corrPixel.getGreen()) + (/* Blue weight * */ corrPixel.getBlue()));
			p.setRed(newRGB);
			p.setGreen(newRGB);
			p.setBlue(newRGB);
		}
		return grayImage;
	}

	public static void main(String[] args) {
		DirectoryResource dr = new DirectoryResource();
		for (File f : dr.selectedFiles()) {
			ImageResource inImage = new ImageResource(f);
			ImageResource gray = makeGray(inImage);
			String filename = gray.getFileName();
			gray.setFileName(filename.substring(0, filename.indexOf(".")) + "-gray.jpg");
			gray.save();
		}
	}
}
