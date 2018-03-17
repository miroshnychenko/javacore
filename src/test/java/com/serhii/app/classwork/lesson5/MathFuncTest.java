package com.serhii.app.classwork.lesson5;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathFuncTest {
    static int number1;
    static int number2;

    @Before
    public void setUp() {
        number1 = 1;
        number2 = 2;
    }

    @Test // JUnit framework annotation
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }


    @Test
    public void multiplyTest1() {
        int expected = 2;
        Assert.assertEquals(expected, MathFunc.multiply(number1, number2));
    }

    @Test
    public void multiplyTest3() {
        number1 = 2;
        number2 = 3;
        int expected = 6;
        Assert.assertEquals(expected, MathFunc.multiply(number1, number2));
    }

    @Ignore
    @Test
    public void multiplyTest4() {
        int expected = 5;
        Assert.assertEquals(expected, MathFunc.multiply(number1, number2));
    }
}

