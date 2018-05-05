package com.serhii.runners.classwork.lesson15;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList wordsList = new ArrayList();
        String usersInput = "";
        while (!usersInput.equals("exit")) {
            usersInput = scanner.next();
            wordsList.add(usersInput);
        }
        wordsList.remove(wordsList.size()-1);

        HashSet set = new HashSet(wordsList);

        System.out.println(set);


    }
}
