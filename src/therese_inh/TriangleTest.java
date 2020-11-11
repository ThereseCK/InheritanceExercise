package therese_inh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getArea() {
        var TriangleArea = new Triangle(2, 4,5);
        assertEquals(3.799671038392666, TriangleArea.getArea());
    }

    @Test
    void getPerimeter() {
        var TrianglePerimeter = new Triangle(2, 4, 5);
        assertEquals(11, TrianglePerimeter.getPerimeter());
    }
}