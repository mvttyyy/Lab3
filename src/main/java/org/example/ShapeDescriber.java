package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber {
    private static final Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);

    public void describe(Shape shape) {
        logger.info("Shape details:");
        logger.info("Shape type: {}", shape.getName());
        logger.info("Shape area: {}", shape.getArea());
        logger.info("Shape perimeter: {}", shape.getPerimeter());
        logger.info("Shape color: {}", shape.getColorDescription());
    }
}
