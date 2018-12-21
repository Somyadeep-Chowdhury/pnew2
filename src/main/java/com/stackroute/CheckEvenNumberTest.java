package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenNumberTest {

    @Test

    public void checkEven1()
    {
        assertEquals(true,CheckEvenNumber.isEven(20));
    }

    @Test

    public void checkEven2()
    {
        assertEquals(false,CheckEvenNumber.isEven(25));
    }


    @Test
    public void checkEven3()
    {
        assertEquals(true,CheckEvenNumber.isEven(30));
    }

    @Test
    public void checkchar()
    {
        assertEquals(true,CheckEvenNumber.isChar('j'));
    }
}