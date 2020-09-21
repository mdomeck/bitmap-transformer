package bitmap.transformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitMapTest {
    // tests that constructor actually makes a bitmap
    // test that the files save with .save
    // test things about the flip output
    // that the positions have flipped
    // that a file was created
    // test that 0,0 is pink and 0, 100 is orange
    @Test
    public void testGrayscale(){
        Bitmap bmp = new Bitmap();
        bmp.grayscale();
        Color actualColor = new Color(bmp.imgData.getRGB(0, 0));

        assertEquals("rgb should be grayscale, RED", actualColor.getRed(), 165);
        assertEquals("rgb should be grayscale, GREEN", actualColor.getGreen(), 165);
        assertEquals("rgb should be grayscale, BLUE", actualColor.getBlue(), 165);
    }
}
