import java.io.*;
import java.util.*;
import resources.*;

public class ColorToGrayscale {
	public static ImageResource makeGray(ImageResource colorImage, int algorithm) {
		if (algorithm > 5 && algorithm < 1) {
			System.out.println("Invalid algorithm, defaulting to ITU-R BT.709");
			algorithm = 2;
		}
		ImageResource grayImage = new ImageResource(colorImage);
		for (Pixel p : grayImage.pixels()) {
			Pixel corrPixel = colorImage.getPixel(p.getX(), p.getY());
			// Mean Color Value
			if (algorithm == 1) {
				int red = corrPixel.getRed();
				int green = corrPixel.getGreen();
				int blue = corrPixel.getBlue();
				int avg = (red + green + blue) / 3;
				p.setRed(avg);
				p.setGreen(avg);
				p.setBlue(avg);
			}
			// ITU-R BT.709 Formula
			if (algorithm == 2) {
				int red = corrPixel.getRed();
				int green = corrPixel.getGreen();
				int blue = corrPixel.getBlue();
				int avg = (int) Math.round((0.2126 * red) + (0.7152 * green) + (0.0722 * blue));
				p.setRed(avg);
				p.setGreen(avg);
				p.setBlue(avg);
			}
			// ITU-R BT.601 Formula
			if (algorithm == 3) {
				int red = corrPixel.getRed();
				int green = corrPixel.getGreen();
				int blue = corrPixel.getBlue();
				int avg = (int) Math.round((0.299 * red) + (0.587 * green) + (0.114 * blue));
				p.setRed(avg);
				p.setGreen(avg);
				p.setBlue(avg);
			}
			// ITU-R BT.2020 Formula
			if (algorithm == 4) {
				int red = corrPixel.getRed();
				int green = corrPixel.getGreen();
				int blue = corrPixel.getBlue();
				int avg = (int) Math.round((0.2627 * red) + (0.6780 * green) + (0.0593 * blue));
				p.setRed(avg);
				p.setGreen(avg);
				p.setBlue(avg);
			}
			// Custom Formula
			if (algorithm == 5) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the red coefficient: ");
				double red = sc.nextDouble();
				System.out.println("Enter the green coefficient: ");
				double green = sc.nextDouble();
				System.out.println("Enter the blue coefficient: ");
				double blue = sc.nextDouble();
				int avg = (int) Math.round((red * corrPixel.getRed()) + (green * corrPixel.getGreen()) + (blue * corrPixel.getBlue()));
				p.setRed(avg);
				p.setGreen(avg);
				p.setBlue(avg);
				sc.close();
			}
			else {
				System.out.println("UNKOWN ERROR");
			}
		}
		return grayImage;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Algorithms: \n1. Mean Color Value\n2. ITU-R BT.709\n3. ITU-R BT.601\n4. ITU-R BT.2020\n5. Custom");
		System.out.println("Enter the number of the algorithm you wish to use: ");
		int algorithm = Integer.parseInt(sc.nextLine());
		sc.close();

		DirectoryResource dr = new DirectoryResource();
		for (File f : dr.selectedFiles()) {
			ImageResource inImage = new ImageResource(f);
			ImageResource gray = makeGray(inImage, algorithm);
			String filename = gray.getFileName();
			gray.setFileName(filename.substring(0, filename.indexOf(".")) + "-gray.jpg");
			gray.save();
		}
		for (int i = 0; i < 100; i++){
			System.out.println("");
		}
		System.out.println("CONVERSION COMPLETE: The grayscale images are saved in the same directory as the original images, with a -gray suffix.");
	}
}
