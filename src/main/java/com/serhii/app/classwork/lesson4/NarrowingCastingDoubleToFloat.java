package com.serhii.app.classwork.lesson4;

public class NarrowingCastingDoubleToFloat {

    double double1 = 3.14159d;
    float float1 = 0.0f;

    public void narrowingDoubleToFloat() {
        float1 = (float) double1;
        System.out.println(float1);
    }
}
