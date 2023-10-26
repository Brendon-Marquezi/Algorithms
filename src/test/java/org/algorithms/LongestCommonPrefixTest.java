package org.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {
    @Test
    public void testAlgorithm1() {
        var longestCommonPrefix = new LongestCommonPrefix();

        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    public void testAlgorithm2() {
        var longestCommonPrefix = new LongestCommonPrefix();

        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    public void testAlgorithm3() {
        var longestCommonPrefix = new LongestCommonPrefix();

        assertEquals("sta", longestCommonPrefix.longestCommonPrefix(new String[]{"stand","star","status","stable"}));
    }
}
