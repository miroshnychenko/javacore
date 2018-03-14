package com.serhii.runners.homework.lesson4.utils.convertors;

import com.serhii.app.homework.lesson4.utils.convertors.PrimitiveConvertor;

public class Lesson4Runner {

    public static void main(String[] args) {

        PrimitiveConvertor convertor = new PrimitiveConvertor();

        convertor.charToInt('a');
        convertor.floatToChar(200);
        convertor.intToChar(96);
    }
}
