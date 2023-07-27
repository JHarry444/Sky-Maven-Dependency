package com.qa.demo.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoggoTest {

    @Test
    void testLength() {
        Assertions.assertEquals(99, DoggoCompetition.placements(44).size());
    }
    @Test
    void testSkipped() {
        Assertions.assertFalse(DoggoCompetition.placements(44).contains("44th"));
    }


    @Test
    void testFirst() {
        Assertions.assertTrue(DoggoCompetition.placements(12).contains("21st"));
    }

    @Test
    void testSecond() {
        Assertions.assertTrue(DoggoCompetition.placements(12).contains("32nd"));
    }

    @Test
    void testThird() {
        Assertions.assertTrue(DoggoCompetition.placements(12).contains("33rd"));
    }

    @Test
    void testFourth() {
        Assertions.assertTrue(DoggoCompetition.placements(12).contains("44th"));
    }

    @Test
    void testEleventh() {
        Assertions.assertTrue(DoggoCompetition.placements(34).contains("11th"));
    }

    @Test
    void testTwelfth() {
        Assertions.assertTrue(DoggoCompetition.placements(34).contains("12th"));
    }

    @Test
    void testThirteenth() {
        Assertions.assertTrue(DoggoCompetition.placements(34).contains("13th"));
    }
}
