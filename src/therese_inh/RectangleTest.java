package therese_inh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getAreaRectangle() {
        var rectArea = new Rectangle(2,2);
        assertEquals(4, rectArea.getArea());
    }

    @Test
    void getPerimeterRectangle() {
        var rectPeri = new Rectangle(2,2);
        assertEquals(8, rectPeri.getPerimeter());
    }
}