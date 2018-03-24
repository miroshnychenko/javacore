package com.serhii.app.homework.lesson6.practice;

import org.junit.Assert;
import org.junit.Test;

public class CircleAreaTest {

    @Test
    public void calculateTest() {
        Assert.assertEquals(12.566370614, CircleArea.calculate(2), 1e-8);
    }

    @Test
    public void calculateFirstBiggerTest() {
        Assert.assertEquals("Circle 1 area is bigger", CircleArea.calculateBigger(2,1));
    }

    @Test
    public void calculateSecondBiggerTest() {
        Assert.assertEquals("Circle 2 area is bigger", CircleArea.calculateBigger(1,2));
    }
}
