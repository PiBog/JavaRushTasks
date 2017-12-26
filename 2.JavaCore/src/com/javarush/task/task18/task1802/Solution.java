package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream sourceFile = new FileInputStream(reader.readLine());
        int minByte = Integer.MAX_VALUE;
        int currentByte = 0;
        while (sourceFile.available() > 0) {
            currentByte = sourceFile.read();
            if (currentByte < minByte) minByte = currentByte;
        }
        System.out.println(minByte);
        reader.close();
        sourceFile.close();
    }
}
