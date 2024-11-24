package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

class MainTest {

    @Test
    void testMainLogic() {
        Color red = new Color(255, 0, 0, 0.8f);
        Color green = new Color(0, 255, 0, 0.6f);

        Shape rectangle = new Rectangle(4.0, 5.0, red);
        Shape triangle = new Triangle(3.0, 4.0, 5.0, green);

        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShapes(List.of(rectangle, triangle));
    }
}
