package com.qa.demo.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {


    @Test
    void test1() {
        Assertions.assertEquals("1!", Factorial.reverse(1));
    }

    @Test
    void test2() {
        Assertions.assertEquals("2!", Factorial.reverse(2));
    }

    @Test
    void test6() {
        Assertions.assertEquals("3!", Factorial.reverse(6));
    }

    @Test
    void test24() {
        Assertions.assertEquals("4!", Factorial.reverse(24));
    }

    @Test
    void test120() {
        Assertions.assertEquals("5!", Factorial.reverse(120));
    }

    @Test
    void testNone() {
        Assertions.assertEquals("NONE", Factorial.reverse(250));
    }

    @Test
    void testNegative() {
        Assertions.assertEquals("NONE", Factorial.reverse(-1));
    }

    @Test
    void testZero() {
        Assertions.assertEquals("NONE", Factorial.reverse(250));
    }


}
