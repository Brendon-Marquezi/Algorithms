package org.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    @Test
    public void testAlgorithm1() {
        var twoSum = new TwoSum();

        int[] return1 = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, return1);
    }

    @Test
    public void testAlgorithm2() {
        var twoSum = new TwoSum();

        int[] return1 = twoSum.twoSum(new int[]{3, 2, 4}, 6);
        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, return1);
    }

    @Test
    public void testAlgorithm3() {
        var twoSum = new TwoSum();

        int[] return1 = twoSum.twoSum(new int[]{3, 3}, 6);
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, return1);
    }
}
