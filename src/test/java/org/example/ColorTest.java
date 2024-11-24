package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {

    @Test
    void testValidColorWithAlpha() {
        Color color = new Color(255, 0, 0, 0.5f);
        assertEquals(255, color.red());
        assertEquals(0, color.green());
        assertEquals(0, color.blue());
        assertEquals(0.5f, color.alpha());
    }

    @Test
    void testValidColorWithoutAlpha() {
        Color color = new Color(128, 255, 64);
        assertEquals(128, color.red());
        assertEquals(255, color.green());
        assertEquals(64, color.blue());
        assertEquals(0.0f, color.alpha());
    }

    @Test
    void testInvalidRedValue() {
        assertThrows(IllegalArgumentException.class, () -> new Color(300, 0, 0));
    }

    @Test
    void testInvalidGreenValue() {
        assertThrows(IllegalArgumentException.class, () -> new Color(0, -10, 0));
    }

    @Test
    void testInvalidAlphaValue() {
        assertThrows(IllegalArgumentException.class, () -> new Color(0, 0, 0, 1.5f));
    }
}
