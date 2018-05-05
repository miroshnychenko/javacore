package com.serhii.runners.classwork.lesson15;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListRunner {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> myList2 = new ArrayList<>();

        System.out.println("My list is empty: " + myList.isEmpty());
        myList.add("First String");
        myList.add("Second String");
        myList.add("Third String");

        myList2.add("zaqwsx");
        myList2.add("wsxdff");
        myList2.add("aqweeww");
        System.out.println("My list is empty: " + myList.isEmpty());

        int size = myList.size();

        System.out.println("My list size is: " + size);
        System.out.println("My list contains \"Second String\": " + myList.contains("Second String"));
        System.out.println("My list contains \"ewq\": " + myList.contains("ewq"));
        myList.remove("First String");
        System.out.println("My list contains \"First String\": " + myList.contains("First String"));
        System.out.println("My list size is: " + size);

        Collections.sort(myList2);
        System.out.println(myList2.get(0));
        System.out.println(myList2.get(1));
        System.out.println(myList2.get(2));

        Collections.reverse(myList2);
        System.out.println(myList2.get(0));
        System.out.println(myList2.get(1));
        System.out.println(myList2.get(2));



    }
}
