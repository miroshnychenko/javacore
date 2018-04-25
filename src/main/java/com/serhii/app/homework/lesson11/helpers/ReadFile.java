package com.serhii.app.homework.lesson11.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static String readFromFile (File file) {
        String line;
        StringBuilder output = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            reader.close();
        }catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        return output.toString();
    }
}
