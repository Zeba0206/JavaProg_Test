package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class evenOddTest {
    evenOdd e1;


    @Before
    public void setUp() throws Exception {
        e1 = new evenOdd();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void oddNumber() {
        Boolean meo = e1.tomOdd();
        assertEquals("10 is a even number", false, meo);
    }

    @Test
    public void checkNull(){
        Boolean r3=e1.checkFloat();
        assertEquals(true,r3);
    }
}