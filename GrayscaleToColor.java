import resources.*;
import java.io.*;
import java.util.*;

public class GrayscaleToColor {
    public static ImageResource makeColor(ImageResource grayImage, int algorithm) {
        ImageResource colorImage = new ImageResource(grayImage);
        if (algorithm == 1) {
            for (Pixel p : colorImage.pixels()) {
                Pixel corrPixel = grayImage.getPixel(p.getX(), p.getY());
                int red = corrPixel.getRed();
                int green = corrPixel.getGreen();
                int blue = corrPixel.getBlue();
                int avg = (red + green + blue) * 3;
                p.setRed(avg);
                p.setGreen(avg);
                p.setBlue(avg);
            }
        }
        // ITU-R BT.709 Formula
        if (algorithm == 2) {
            for (Pixel p : colorImage.pixels()) {
                Pixel corrPixel = grayImage.getPixel(p.getX(), p.getY());
                int red = (int) corrPixel.getRed();
                int green = (int) corrPixel.getGreen();
                int blue = (int) corrPixel.getBlue();

                p.setRed((int) Math.round(red / 0.2126));
                p.setGreen((int) Math.round(green / 0.7152));
                p.setBlue((int) Math.round(blue / 0.0722));
            }
        }
        // ITU-R BT.601 Formula
        if (algorithm == 3) {
            for (Pixel p : colorImage.pixels()) {
                Pixel corrPixel = grayImage.getPixel(p.getX(), p.getY());
                int red = corrPixel.getRed();
                int green = corrPixel.getGreen();
                int blue = corrPixel.getBlue();
                
                p.setRed((int) Math.round(red / 0.299));
                p.setGreen((int) Math.round(green / 0.587));
                p.setBlue((int) Math.round(blue / 0.114));
            }
        }
        return colorImage;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Mean Color Value\n2. ITU-R BT.709 Formula\n3. ITU-R BT.601 Formula");
        System.out.println("Enter the algorithm you want to use: ");
        int algorithm = sc.nextInt();
        sc.close();
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            ImageResource grayImage = new ImageResource(f);
            ImageResource colorImage = makeColor(grayImage, algorithm);
            String filename = colorImage.getFileName();
            colorImage.setFileName(filename.substring(0, filename.indexOf(".")) + "-colored.jpg");
            colorImage.save();
        }
        for (int i = 0; i < 100; i++){
            System.out.println("");
        }
        System.out.println("CONVERSION COMPLETE: The colored images are saved in the same directory as the original images, with a -colored suffix.");
    }
}
