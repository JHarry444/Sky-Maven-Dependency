package com.qa.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    void emptyTest() {
        // tests pass by default
    }

    @Test
    void testTimesFiveAndFive() {
        assertEquals(25, Calculator.multiply(5, 5));
    }

    @Test
    void testAddNegatives() {
        assertEquals(2, Calculator.add(5, -3));
    }

    @Test
    void testPass() {
        assertEquals(4, 2 + 2);
    }

//    @Test
    void testFail() {
        assertEquals(5, 2 + 2);
        assertEquals(8, Calculator.multiply(4, 2));
    }
}
