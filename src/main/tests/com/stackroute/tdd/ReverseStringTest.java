package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString r1;
    ReverseString space;
    @Before
    public void setUp() throws Exception {
        r1=new ReverseString();
        space=new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseStr() {

        String r2=r1.reverseStr();
        assertEquals("abez",r2);
    }

   @Test
   public void checkNull(){
        Boolean r3=r1.checkNull();
        assertEquals(true,r3);

   }
    @Test
    public void should_Recognize_Empty_String() {
        Boolean d = space.checkSpaces();
        assertEquals(true, d);
    }



}
