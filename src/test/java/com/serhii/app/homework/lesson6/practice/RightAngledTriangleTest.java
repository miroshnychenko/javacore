package com.serhii.app.homework.lesson6.practice;

import org.junit.Assert;
import org.junit.Test;

public class RightAngledTriangleTest {

    private RightAngledTriangle triangle = new RightAngledTriangle();

    @Test
    public void isRightAngledTrueTest() {
        triangle.setSideA("3");
        triangle.setSideB("4");
        triangle.setSideC("5");
        Assert.assertTrue(triangle.isRightAngled());
    }

    @Test
    public void isRightAngledFalseTest() {
        triangle.setSideA("31");
        triangle.setSideB("12");
        triangle.setSideC("51");
        Assert.assertFalse(triangle.isRightAngled());
    }

    @Test
    public void isRightAngledToConsoleTrueTest() {
        triangle.setSideA("3");
        triangle.setSideB("4");
        triangle.setSideC("5");
        Assert.assertEquals("Triangle is right angled", triangle.isRightAngledToConsole());
    }

    @Test
    public void isRightAngledToConsoleFalseTest() {
        triangle.setSideA("31");
        triangle.setSideB("12");
        triangle.setSideC("51");
        Assert.assertEquals("Triangle is not right angled", triangle.isRightAngledToConsole());
    }

}
