package com.serhii.app.classwork.lesson4;

public class NarrowingCastingIntToFloat {
    int int1 = 127;
    float float1 = 0.0f;

    public void narrowingIntToFloat() {
        float1 = int1;
        System.out.println(float1);
    }

    public static float narrowingIntToFloat(int num) {
        return num;
    }
}
