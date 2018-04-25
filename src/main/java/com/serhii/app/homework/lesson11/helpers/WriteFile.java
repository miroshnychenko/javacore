package com.serhii.app.homework.lesson11.helpers;

import java.io.*;
import java.util.Arrays;

public class WriteFile {

    private BufferedWriter writer;

    private WriteFile(File file) {
        try {
            this.writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

    }

    private void writeToFile(String str) throws IOException {
        writer.append(str);
        writer.newLine();
    }

    private void closeWriter() throws IOException {
        writer.close();
    }

    public static void writeToFile (String str, File output) {
        String[] stringArray = str.split("\n");
        String[][] stringArray2 = new String[stringArray.length][];
        WriteFile writer = new WriteFile(output);

        for (int i = 0; i < stringArray.length; i++) {
            stringArray2[i] = stringArray[i].split(",");
            Arrays.sort(stringArray2[i]);
            try {
                writer.writeToFile(Arrays.toString(stringArray2[i]));
            }catch (IOException e) {
                System.out.println(e.getStackTrace());
            }
        }

        try {
            writer.closeWriter();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}

