package com.serhii.app.classwork.lesson4;

public class NarrowingCastingFloatToInt {
    int int1 = 0;
    float float1 = 3.14159f;

    public void narrowingFloatToInt() {
        int1 = (int) float1;

        System.out.println(int1);
    }

    public static int narrowingFloatToInt(float num) {
        return (int) num;
    }
}
