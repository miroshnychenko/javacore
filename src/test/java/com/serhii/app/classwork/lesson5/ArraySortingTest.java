package com.serhii.app.classwork.lesson5;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArraySortingTest {
    int [] array = {8,7,6,3,2,1,0,9};
    int [] expected = {0,1,2,3,6,7,8,9};

    @Test
    public void arraySortTest() {
        Arrays.sort(array);
        Assert.assertArrayEquals(expected, array);
    }

}
