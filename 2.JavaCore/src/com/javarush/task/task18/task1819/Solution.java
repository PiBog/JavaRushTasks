package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        FileInputStream fisOne = new FileInputStream(fileOne);
        byte[] byteBuffOne = new byte[fisOne.available()];
        fisOne.read(byteBuffOne);
        fisOne.close();
        FileOutputStream fosOne = new FileOutputStream(fileOne);
        FileInputStream fisTwo = new FileInputStream(fileTwo);
        byte[] byteBuffTwo = new byte[fisTwo.available()];
        fisTwo.read(byteBuffTwo);
        fosOne.write(byteBuffTwo);
        fosOne.write(byteBuffOne);
        fosOne.close();
        fisTwo.close();

    }
}
