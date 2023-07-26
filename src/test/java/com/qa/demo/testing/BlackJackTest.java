package com.qa.demo.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackTest {


    @Test
    void testP1Bust() {
        Assertions.assertEquals(19, BlackJack.play(22, 19));
    }

    @Test
    void testP2Bust() {
        Assertions.assertEquals(17, BlackJack.play(17, 24));
    }

    @Test
    void testBothBust() {
        Assertions.assertEquals(0, BlackJack.play(25, 23));
    }

    @Test
    void testP1Win() {
        Assertions.assertEquals(18, BlackJack.play(18, 16));
    }

    @Test
    void testP2Win() {
        Assertions.assertEquals(17, BlackJack.play(15, 17));
    }

    @Test
    void testDraw() {
        Assertions.assertEquals(20, BlackJack.play(20, 20));

    }
}
