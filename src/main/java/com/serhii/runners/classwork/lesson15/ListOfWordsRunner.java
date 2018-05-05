package com.serhii.runners.classwork.lesson15;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfWordsRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();

        String usersInput = "";

        while (!usersInput.equals("exit")) {
            usersInput = scanner.next();
            myList.add(usersInput);
        }
        myList.remove(myList.size()-1);
        System.out.println(myList);

    }
}
