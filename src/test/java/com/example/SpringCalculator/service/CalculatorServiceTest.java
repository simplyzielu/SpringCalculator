package com.example.SpringCalculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    //Chciałem się bawić w tworzenie stałych, ale to chyba nie ma sensu w przypadku testowania
    //takich niskopoziomowych metod, gdzie tak czy inaczej te wartości wykorzystywane są tylko raz
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testAdd() {
        assertEquals(4, calculatorService.add(2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, calculatorService.subtract(5, 2));
    }

    @Test
    public void testMultiply() {
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