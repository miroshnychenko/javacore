package com.serhii.app.homework.lesson6.practice;

import org.junit.Assert;
import org.junit.Test;

public class EvenOddTest {

    @Test
    public void isEvenTrueTest () {
        Assert.assertTrue(EvenOdd.isEven(4));
    }

    @Test
    public void isEvenFalseTest () {
        Assert.assertFalse(EvenOdd.isEven(1));
    }

    @Test
    public void isOddTrueTest() {
        Assert.assertTrue(EvenOdd.isOdd(1));
    }

    @Test
    public void isOddFalseTest() {
        Assert.assertFalse(EvenOdd.isOdd(2));
    }

    @Test
    public void isEvenOrOddTestEven() {
        Assert.assertEquals("is Even", EvenOdd.isEvenOrOdd(4));
    }

    @Test
    public void isEvenOrOddTestOdd() {
        Assert.assertEquals("is Odd", EvenOdd.isEvenOrOdd(25));
    }
}
