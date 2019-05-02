package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTesterClassTest {



    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_Recognize_Null() {
        assertEquals(false, PalindromeTesterClass.isPalindrome(null));
    }

    @Test
    public void should_Recognize_EmptyString() {
        assertEquals(true, PalindromeTesterClass.isPalindrome(""));
    }

    @Test
    public void should_Recognize_OneCharacter_Palindrome() {
        assertEquals(true, PalindromeTesterClass.isPalindrome("a"));
    }

    @Test
    public void should_Recognize_TwoCharacterPalindrome() {
        assertEquals(true, PalindromeTesterClass.isPalindrome("aa"));
    }

    @Test
    public void should_Recognize_TwoCharacterNonPalindrome() {
        assertEquals(false, PalindromeTesterClass.isPalindrome("ab"));
    }

    @Test
    public void should_Recognize_Palindrome() {
        assertEquals(true, PalindromeTesterClass.isPalindrome("amanaplanacanalpanama"));
    }

    @Test
    public void should_Recognize_NonPalindrome() {
        assertEquals(false, PalindromeTesterClass.isPalindrome("noPalindrome"));
    }

}