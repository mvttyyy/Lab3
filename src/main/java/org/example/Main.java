package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Color red = new Color(255, 0, 0, 0.8f);
        Color green = new Color(0, 255, 0, 0.6f);
        Color blue = new Color(0, 0, 255, 1.0f);

        Shape rectangle1 = new Rectangle(4.0, 5.0, red);
        Shape triangle1 = new Triangle(6.0, 8.0, 10.0, green);
        Shape rectangle2 = new Rectangle(3.0, 6.0, blue);

        ShapeDescriber describer = new ShapeDescriber();
        describer.describe(rectangle1);
        describer.describe(triangle1);
        describer.describe(rectangle2);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle1);
        shapes.add(triangle1);
        shapes.add(rectangle2);

        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShapes(shapes);
    }
}
