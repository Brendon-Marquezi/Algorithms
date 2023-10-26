package org.algorithms;

/*
    Algorithm Palindrome Number
    https://leetcode.com/problems/palindrome-number/

    Given an integer x, return true if x is a palindrome, and false otherwise.
 */

public class PalindromeNumber {
    public Boolean isPalindrome(int x) {
        return String.valueOf(x).contentEquals(new StringBuilder(String.valueOf(x)).reverse());
    }
}
