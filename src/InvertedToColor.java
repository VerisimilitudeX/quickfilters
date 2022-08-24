import resources.*;
import java.io.*;

public class InvertedToColor {
    public static ImageResource makeInverted(ImageResource colorImage) {
        ImageResource invertedImage = new ImageResource(colorImage);
        for (Pixel p : invertedImage.pixels()) {
            Pixel corrPixel = colorImage.getPixel(p.getX(), p.getY());
            int red = corrPixel.getRed();
            int green = corrPixel.getGreen();
            int blue = corrPixel.getBlue();
            p.setRed(255 - red);
            p.setGreen(255 - green);
            p.setBlue(255 - blue);
        }
        return invertedImage;
    }
    
    public static void main(String[] args) {
        

        
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            ImageResource colorImage = new ImageResource(f);
            ImageResource gray = makeInverted(colorImage);
            String filename = gray.getFileName();
            gray.setFileName(filename.substring(0, filename.indexOf(".")) + "-colored.jpg");
            gray.save();
        }
        for (int i = 0; i < 100; i++){
            System.out.println("");
        }
        System.out.println("CONVERSION COMPLETE: The colored images are saved in the same directory as the original images, with a -colored suffix.");
    }
}
