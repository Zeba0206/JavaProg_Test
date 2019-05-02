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
    public void shouldRecognizeNull() {
        assertEquals(false, PalindromeTesterClass.isPalindrome(null));
    }

    @Test
    public void shouldRecognizeEmptyString() {
        assertEquals(true, PalindromeTesterClass.isPalindrome(""));
    }

    @Test
    public void shouldRecognizeOneCharacterPalindrome() {
        assertEquals(true, PalindromeTesterClass.isPalindrome("a"));
    }

    @Test
    public void shouldRecognizeTwoCharacterPalindrome() {
        assertEquals(true, PalindromeTesterClass.isPalindrome("aa"));
    }

    @Test
    public void shouldRecognizeTwoCharacterNonPalindrome() {
        assertEquals(false, PalindromeTesterClass.isPalindrome("ab"));
    }

    @Test
    public void shouldRecognizePalindrome() {
        assertEquals(true, PalindromeTesterClass.isPalindrome("amanaplanacanalpanama"));
    }

    @Test
    public void shouldRecognizeNonPalindrome() {
        assertEquals(false, PalindromeTesterClass.isPalindrome("noPalindrome"));
    }

}