package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testAreaCalculation() {
        Rectangle rectangle = new Rectangle(4.0, 5.0, new Color(255, 0, 0, 0.8f));
        assertEquals(20.0, rectangle.getArea());
    }

    @Test
    void testPerimeterCalculation() {
        Rectangle rectangle = new Rectangle(4.0, 5.0, new Color(255, 0, 0, 0.8f));
        assertEquals(18.0, rectangle.getPerimeter());
    }

    @Test
    void testColorDescription() {
        Rectangle rectangle = new Rectangle(4.0, 5.0, new Color(255, 0, 0, 0.8f));
        String expected = "Red: 255, Green: 0, Blue: 0, Alpha: 0.80\n";
        assertEquals(expected, rectangle.getColorDescription());
    }

}
