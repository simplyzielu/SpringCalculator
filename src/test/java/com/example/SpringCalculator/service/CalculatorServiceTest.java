package com.example.SpringCalculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void shouldAddTwoPassedArguments() {
        assertEquals(4, calculatorService.add(2, 2));
    }

    @Test
    public void shouldSubtractTwoPassedArguments() {
        assertEquals(3, calculatorService.subtract(5, 2));
    }

    @Test
    public void shouldMultiplyTwoPassedArguments() {
        assertEquals(10, calculatorService.multiply(2, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(3, calculatorService.divide(9, 3));
    }

    @Test
    public void testDivideByZero() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculatorService.divide(10, 0)
        );

        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    public void testModulo() {
        assertEquals(1, calculatorService.modulo(10, 3));
    }

    @Test
    public void testModuloByZero() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculatorService.modulo(10, 0)
        );

        assertEquals("/ by zero", exception.getMessage());
    }
}