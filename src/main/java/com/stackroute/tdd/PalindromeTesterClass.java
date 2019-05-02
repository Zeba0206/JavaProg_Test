package com.stackroute.tdd;

public class PalindromeTesterClass {


    public static boolean isPalindrome(String word) {
        if (word == null) {
            // assuming a null value is no palindrome
            return false;
        } else if (word.length() < 2) {
            // assuming both "" and "x" are palindromes
            return true;
        } else {
            // a word is a palindrome if it starts and ends in the same letter..
            if (!word.endsWith(word.substring(0, 1))) {
                return false;
            }
            // .. and everything in between the first and the last letter is a palindrome
            return isPalindrome(word.substring(1, word.length() - 1));
        }
    }
}