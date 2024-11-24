package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

class ShapeRendererTest {

    @Test
    void testRenderShapes() {
        ShapeRenderer renderer = new ShapeRenderer();
        List<Shape> shapes = List.of(
                new Rectangle(4.0, 5.0, new Color(255, 0, 0, 0.8f)),
                new Triangle(3.0, 4.0, 5.0, new Color(0, 255, 0, 0.6f))
        );
        renderer.renderShapes(shapes);
        // Wizualna weryfikacja rysowania w konsoli
    }
}
