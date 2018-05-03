package com.serhii.runners.classwork.lesson14;

import com.serhii.app.classwork.lesson14.enums.Holidays;

import java.util.Arrays;

public class HolidaysRunner {
    public static void main(String[] args) {
        Holidays holidays = Holidays.NEW_YEAR;
        System.out.println(Arrays.toString(Holidays.values()));
        System.out.println(holidays.NEW_YEAR);
    }
}
