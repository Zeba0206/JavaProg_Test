package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {
    EvenOdd e1;

    @Before
    public void setUp() throws Exception {
        e1 = new EvenOdd();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void OddNumber() {
        Boolean meo = e1.TomOdd();
        assertEquals("10 is a even number", false, meo);
    }
}