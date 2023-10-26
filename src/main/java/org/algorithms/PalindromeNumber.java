package org.algorithms;

/*
    Algorithm Palindrome Number
    https://leetcode.com/problems/palindrome-number/

    Given an integer x, return true if x is a palindrome, and false otherwise.
 */

public class PalindromeNumber {
    public Boolean isPalindrome(int x) {
        String numberStr = Integer.toString(x);
        String reverseNumberStr = new StringBuilder(numberStr).reverse().toString();
        return numberStr.equals(reverseNumberStr);
    }
}
