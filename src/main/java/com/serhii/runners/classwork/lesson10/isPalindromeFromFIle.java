package com.serhii.runners.classwork.lesson10;

import java.io.IOException;

public class isPalindromeFromFIle {
    public static void main(String[] args) throws IOException{
        String inputFile = "/Users/serhii/Documents/words.txt";
        String outputFile = "/Users/serhii/Documents/output.txt";

        FileExceptions.checkIfPalindromeFormFile(inputFile, outputFile);
    }
}
