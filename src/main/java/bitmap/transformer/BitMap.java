package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BitMap {
    int height;
    int width;
    public String filePath;
    BufferedImage imgData;
    public BitMap(String filePath) {
        try {
            this.imgData = ImageIO.read(new File("./src/main/resources/mario.bmp"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.height = imgData.getHeight();
        this.width = imgData.getWidth();
    }
    public void invert() {
        int rgb;
        for(int i = 1; i < this.imgData.getWidth(); i++){
            for (int j = 1; j < this.imgData.getHeight(); j++){
                rgb = 255 - this.imgData.getRGB(j, i);
                this.imgData.setRGB(j, i, rgb);
            }
        }
    }

//    public BitMap colorize(BitMap imgData, int dstColor) {
//            i
//
//        for(int i = 0; i < this.imgData.getWidth(); i++){
//            for (int j = 0; j < this.imgData.getHeight(); j++){
//
//            }
//        }
//    }
//
//    public void test3() {
//        for(int i = 0; i < this.imgData.getWidth(); i++){
//            for (int j = 0; j < this.imgData.getHeight(); j++){
//
//            }
//        }
//    }

}
