package com.serhii.app.homework.lesson5;

public class MathFuncHome {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (b == 0) throw new ArithmeticException("You are dividing by zero");
        return a / b;
    }

}

