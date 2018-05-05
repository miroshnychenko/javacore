package com.serhii.runners.classwork.lesson15;

import com.serhii.app.homework.lesson13.flower.Flower;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        Flower flower = new Flower(30);

        Map map = new HashMap<>();

        map.put(flower, "ewqe");
        map.put("ewq", 48875);
        map.put("e21", 48875);
        map.put("eqwe", 48875);
        System.out.println(map.get(flower));

        flower.price = 10;

        System.out.println(map.get(flower));
        System.out.println(map.get("ewq"));
        System.out.println(map.get("qwe"));

        map.put(null, 98);
        System.out.println(map.get(null));
        System.out.println(map.containsKey(null));
        System.out.println(map.get(flower));
        System.out.println(map.containsValue(null));
        System.out.println(map.containsValue(48875));

       /* map.put(1, null);
        System.out.println(map.containsValue(null));*/
        System.out.println(map);
        System.out.println(map.isEmpty());





    }
}
