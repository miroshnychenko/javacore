package com.serhii.app.homework.lesson5;

import com.serhii.app.classwork.lesson4.NarrowingCastingDoubleToFloat;
import com.serhii.app.classwork.lesson4.NarrowingCastingFloatToInt;
import com.serhii.app.classwork.lesson4.NarrowingCastingIntToFloat;
import com.serhii.app.classwork.lesson4.WideningCasting;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class LessonFiveHomework {
    private MathFuncHome math = new MathFuncHome();

    @Test
    @FileParameters(value = "src/test/resources/AdditionTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void additionTest(int a, int b, int expected){
        Assert.assertEquals(expected, math.addition(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/SubstractionTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void substractionTest(int a, int b, int expected) {
        Assert.assertEquals(expected, math.subtraction(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/DivisionTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void divisionTest(int a, int b, int expected) {
        Assert.assertEquals(expected, math.division(a, b));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionExceptionTest(){
        math.division(1,0);
    }

    @Test
    public void mathPowTest(){
        double num1 = 4.0;
        double num2 = 2.0;
        double expected = 16.0;
        Assert.assertTrue(expected == Math.pow(num1, num2));
    }

    @Test
    public void narrowingDoubleToFloatTest(){
        float expected = 16.0f;
        // 1e-8 stands for delta
        Assert.assertEquals(expected, NarrowingCastingDoubleToFloat.narrowingDoubleToFloat(16.0), 1e-8);
    }

    @Test
    public void narrowingFloatToIntTest(){
        int actual = NarrowingCastingFloatToInt.narrowingFloatToInt(127.0f);
        int expected = 127;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void narrowingIntToFloatTest(){
        float expected = 2.0f;
        Assert.assertEquals(expected, NarrowingCastingIntToFloat.narrowingIntToFloat(2), 1e-8);
    }

    @Test
    public void wideningTest(){
        double expected = 35.0;
        Assert.assertEquals(expected, WideningCasting.widening((byte)35), 1e-8);
    }

}
