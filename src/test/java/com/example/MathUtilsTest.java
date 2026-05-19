package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    void testAdd() {
        assertEquals(8, mathUtils.add(3, 5));
        assertEquals(0, mathUtils.add(-1, 1));
        assertEquals(-5, mathUtils.add(-3, -2));
    }

    @Test
    void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3));
        assertEquals(-4, mathUtils.subtract(-1, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, mathUtils.multiply(3, 5));
        assertEquals(0, mathUtils.multiply(0, 100));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, mathUtils.divide(5, 2));
        assertEquals(3.0, mathUtils.divide(9, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class,
            () -> mathUtils.divide(10, 0));
    }
}
