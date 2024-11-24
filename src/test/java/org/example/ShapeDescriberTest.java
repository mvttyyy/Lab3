package org.example;

import org.junit.jupiter.api.Test;

class ShapeDescriberTest {

    @Test
    void testDescribeRectangle() {
        ShapeDescriber describer = new ShapeDescriber();
        Rectangle rectangle = new Rectangle(4.0, 5.0, new Color(255, 0, 0, 0.8f));
        describer.describe(rectangle);
        // Wizualna weryfikacja logów w konsoli
    }

    @Test
    void testDescribeTriangle() {
        ShapeDescriber describer = new ShapeDescriber();
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, new Color(0, 255, 0, 0.6f));
        describer.describe(triangle);
        // Wizualna weryfikacja logów w konsoli
    }
}
