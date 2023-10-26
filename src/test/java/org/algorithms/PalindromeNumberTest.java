package org.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {
    @Test
    public void testAlgorithm1() {
        var palindromeNumber = new PalindromeNumber();

        Boolean return1 = palindromeNumber.isPalindrome(121);
        assertTrue(return1);
    }

    @Test
    public void testAlgorithm2() {
        var palindromeNumber = new PalindromeNumber();

        Boolean return1 = palindromeNumber.isPalindrome(-121);
        assertFalse(return1);
    }

    @Test
    public void testAlgorithm3() {
        var palindromeNumber = new PalindromeNumber();

        Boolean return1 = palindromeNumber.isPalindrome(10);
        assertFalse(return1);
    }
}
