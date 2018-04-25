package com.serhii.runners.homework.lesson11;

import com.serhii.app.homework.lesson11.helpers.ReadFile;
import com.serhii.app.homework.lesson11.helpers.WriteFile;

import java.io.File;

public class Lesson11Runner {

    public static void main(String[] args) {
        File input = new File("/Users/serhii/Documents/Auto/Kit/ReadWrite/lesson11input.txt");
        File output = new File("/Users/serhii/Documents/Auto/Kit/ReadWrite/lesson11output.txt");
        String line =  line = ReadFile.readFromFile(input);
        WriteFile.writeToFile(line, output);
    }
}
