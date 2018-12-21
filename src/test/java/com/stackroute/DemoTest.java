package com.stackroute;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    Demo demo = null;

    @Before
    public void setUp(){
        demo = new Demo();
    }


    @Test
    public void testAdd(){
        //act

        int expected = 12;
        //arrange
        int result = demo.add(4,8);

        //assert

        assertEquals(expected, result);
    }

}