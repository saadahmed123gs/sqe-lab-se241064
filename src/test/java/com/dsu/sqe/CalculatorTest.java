package com.dsu.sqe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, calc.add(-2, -3));
    }

    @Test
    void testSubtract() {
        assertEquals(4, calc.subtract(7, 3));
    }

    @Test
    void testSubtractNegativeNumbers() {
        assertEquals(1, calc.subtract(-2, -3));
    }

    @Test
    void testMultiply() {
        assertEquals(12, calc.multiply(3, 4));
    }

    @Test
    void testMultiplyNegativeNumbers() {
        assertEquals(-12, calc.multiply(-3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}