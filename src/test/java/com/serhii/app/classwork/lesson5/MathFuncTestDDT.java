package com.serhii.app.classwork.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MathFuncTestDDT {
    @Test
    @FileParameters(value = "src/test/resources/testData.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expeted) {
        Assert.assertEquals(expeted, MathFunc.multiply(argA, argB));
    }
}
