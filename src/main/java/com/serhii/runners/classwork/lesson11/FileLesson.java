/*
package com.serhii.runners.classwork.lesson11;

import com.serhii.app.classwork.lesson11.ReadFromFile;
import com.serhii.app.homework.Lesson9.Palindrome;

import java.io.*;

public class FileLesson {

    public static void main(String[] args) throws IOException {
        String currentDir = System.getenv("WRITE_PATH");
        File file = new File(currentDir);
        */
/*System.out.println(file.getAbsolutePath());
        writeToFile(file);*//*

        String out =  ReadFromFile.readFromFile(file);
        System.out.println(out);
    }

    private static void writeToFile(File file) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        String outputFile = "/Users/serhii/Documents/output.txt";
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile)));

        while ((line = reader.readLine()) != null) {
            if (Palindrome.isPalindrome1(line)) {
                writer.append(line);
                writer.newLine();
            }
        }
        writer.close();
        reader.close();
    }
}
*/
