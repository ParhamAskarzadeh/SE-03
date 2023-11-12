package test;

import org.junit.jupiter.api.Test;
import rectangle.Rectangle;

public class RectangleTest {

    @Test
    public void testComputeArea() {
        Rectangle rectangle = new Rectangle(10, 5);
        int expectedArea = 50;
        int actualArea = rectangle.computeArea();
        assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testComputeAreaWithZeroHeight() {
        Rectangle rectangle = new Rectangle(0, 5);
        int expectedArea = 0;
        int actualArea = rectangle.computeArea();
        assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testComputeAreaWithNegativeHeight() {
        Rectangle rectangle = new Rectangle(-1, 5);
        int expectedArea = 0;
        int actualArea = rectangle.computeArea();
        assertEquals(expectedArea, actualArea);
    }
}
