package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testAreaCalculation() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, new Color(0, 255, 0, 0.6f));
        assertEquals(6.0, triangle.getArea(), 0.001);
    }

    @Test
    void testPerimeterCalculation() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, new Color(0, 255, 0, 0.6f));
        assertEquals(12.0, triangle.getPerimeter());
    }

    @Test
    void testColorDescription() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, new Color(0, 255, 0, 0.6f));
        String expected = "Red: 0, Green: 255, Blue: 0, Alpha: 0.60\n";
        assertEquals(expected, triangle.getColorDescription());
    }

}
