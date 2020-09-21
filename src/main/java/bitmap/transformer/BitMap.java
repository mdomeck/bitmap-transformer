package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;


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
    }

    public void invert() {
        int rgb;
        for (int i = 1; i < this.imgData.getWidth(); i++) {
            for (int j = 1; j < this.imgData.getHeight(); j++) {
                rgb = 255 - this.imgData.getRGB(j, i);
                this.imgData.setRGB(j, i, rgb);
            }
        }
    }
    public void flipVertically(){}
        for(int i = 0; i < this.imgData.getWidth(); i++){
            for(int j = 0; j < this.imgData.getHeight() /2; j++){
                int temp = this.imgData.getRGB(i,j);
                this.imgData.setRGB(i,j, this.imgData.getRGB(i, this.imgData.getWidth()));
                this.imgData.setRGB(i,j, this.imgData.getRGB(i, this.imgData.getWidth()));
            }
    }
        public void grayscale(){
            for(int width = 0; width < this.imgData.getWidth(); width++){
                for(int height = 0; height < this.imgData.getHeight() / 2; height++){
                    int newGrayColor = grayscale(this.imgData.getRGB(width, height);
                    this.imgData.setRGB(width, height, newGrayColor);
                }
            }
            this.save(new File("src/main/java/resources/gray.bmp").toPath());
        }
        public int grayscale(int originalColor){
            Color color = new Color(originalColor);
            int average = color.getBlue() + color.getGreen() + color.getRed() / 3;
            Color newColor = new Color(average, average, average);
            return newColor.getRGB();
        }

        public boolean save(Path savePath){
            try {
                return ImageIO.write(new File(imgData, "bmp", savePath.toFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}



