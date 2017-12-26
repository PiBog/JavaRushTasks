package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        int count = 0;
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        while (fileInputStream.available() > 0){
            int bt = fileInputStream.read();
            if (((bt>=65)&&(bt<=90))||((bt>=97)&&(bt<=122))) count++;

        }
        fileInputStream.close();
        System.out.println(count);
    }
}
