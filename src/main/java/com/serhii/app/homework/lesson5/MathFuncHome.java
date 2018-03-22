package com.serhii.app.homework.lesson5;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

public class MathFuncHome {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int division (int a, int b) {
        if (b == 0) throw new ArithmeticException("You are dividing by zero");
        return a / b;
    }

}

