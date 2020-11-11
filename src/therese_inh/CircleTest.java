package therese_inh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        var circleArea = new Circle(12);
        assertEquals(452.3893421169302, circleArea.getArea());
    }

    @Test
    void getPerimeter() {
        var circlePerimeter = new Circle(12);
        assertEquals(75.39822368615503, circlePerimeter.getPerimeter());
    }

}