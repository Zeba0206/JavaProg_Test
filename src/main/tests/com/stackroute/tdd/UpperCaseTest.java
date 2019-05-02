package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseTest {
    UpperCase s;

    @Before
    public void setUp() throws Exception {
        s=new UpperCase();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void stringDemo() {

        String res=s.stringDemo();
        assertEquals("zeba" , res);
    }

    public void checkNull(){
    }

}
