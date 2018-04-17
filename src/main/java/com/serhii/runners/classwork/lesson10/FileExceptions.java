package com.serhii.runners.classwork.lesson10;

import com.serhii.app.homework.Lesson9.Palindrome;

import java.io.*;

public class FileExceptions {

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/serhii/Documents/input.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println();
        } finally {
            System.out.println("Go go go");
        }

        readTheFile("/Users/serhii/Documents/input.txt");
        writeToFile("/Users/serhii/Documents/output.txt");
    }

    public static void readTheFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    private static void writeToFile (String pathToFIle) throws IOException {
        String firstLine = "The first line";
        String secondLine = "The second line";
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToFIle)));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();

    }

    private static void writeToFile1 (String pathToFIle, String str) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToFIle)));
        writer.append(str);
        writer.newLine();
        String firstLine = "The first line";
        writer.append(firstLine);
    }

    public static void checkIfPalindromeFormFile(String inputFilePath, String outputFilePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        String line;

        while ((line = reader.readLine()) != null) {
            if (Palindrome.isPalindrome1(line)) {
                System.out.println("Palindrome found: " + line + "\nWriting to file");
                writeToFile1(outputFilePath, line);
            }
        }
        reader.close();
    }
}
