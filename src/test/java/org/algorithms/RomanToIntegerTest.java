package org.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntegerTest {

    @Test
    public void testAlgorithm1() {
        var romanToInteger = new RomanToInteger();

        assertEquals(3, romanToInteger.romanToInteger("III"));
    }

    @Test
    public void testAlgorithm2() {
        var romanToInteger = new RomanToInteger();

        assertEquals(58, romanToInteger.romanToInteger("LVIII"));
    }

    @Test
    public void testAlgorithm3() {
        var romanToInteger = new RomanToInteger();

        assertEquals(1994, romanToInteger.romanToInteger("MCMXCIV"));
    }
}
