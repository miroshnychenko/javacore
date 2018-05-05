package com.serhii.runners.classwork.lesson15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListOfWords {
    public static void main(String[] args) {
        String car1 = "BMW";
        String car2 = "AUDI";
        String car3 = "Mercedes";
        String car4 = "Lada";
        String car5 = "KIA";

        ArrayList<String> carList = new ArrayList<String>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        Map map = new HashMap();

        map.put("cars", carList);

        System.out.println(map.get("cars"));
    }

}
