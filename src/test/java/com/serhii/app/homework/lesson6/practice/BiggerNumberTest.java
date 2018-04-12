package com.serhii.app.homework.lesson6.practice;

import org.junit.Assert;
import org.junit.Test;

public class BiggerNumberTest {

    private BiggerNumber numbers = new BiggerNumber();



    @Test
    public void secondNumberIsBiggerTest() {
        numbers.setNumber1("1");
        numbers.setNumber2("2");
        Assert.assertEquals("Number two is bigger", numbers.whatNumberIsBigger(numbers.getNumber1(), numbers.getNumber2()));
    }

    @Test
    public void firstNumberIsBiggerTest() {
        numbers.setNumber1("2");
        numbers.setNumber2("1");
        Assert.assertEquals("Number one is bigger", numbers.whatNumberIsBigger(numbers.getNumber1(), numbers.getNumber2()));
    }

    @Test
    public void NumbersAreEqualTest() {
        numbers.setNumber1("2");
        numbers.setNumber2("2");
        Assert.assertEquals("Numbers are equal", numbers.whatNumberIsBigger(numbers.getNumber1(), numbers.getNumber2()));
    }

}
