package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args[0].equals("-e")) code(args[1], args[2]);
        if (args[0].equals("-d")) decode(args[1], args[2]);

    }

    public static void code (String fileName, String fileOutputName) throws IOException {

        FileInputStream fis = new FileInputStream(fileName);
        FileOutputStream fos = new FileOutputStream(fileOutputName);
        while (fis.available() > 0) {
            int b = fis.read();
            fos.write(b+3);
        }
        fis.close();
        fos.close();
    }

    public static void decode (String fileName, String fileOutputName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        FileOutputStream fos = new FileOutputStream(fileOutputName);
        while (fis.available() > 0) {
            int b = fis.read();
            fos.write(b-3);
        }
        fis.close();
        fos.close();

    }

}
