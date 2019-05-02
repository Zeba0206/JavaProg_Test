package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p;

    @Before
    public void setUp() throws Exception {
        p=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkPalindrome() {
        p.checkPalindrome(1221);
        assertEquals(121,121);

    }
    @Test
    public void shouldRecognizeTwoCharacterPalindrome() {
        assertEquals(true, Palindrome.isPalindrome("aa"));
    }


}