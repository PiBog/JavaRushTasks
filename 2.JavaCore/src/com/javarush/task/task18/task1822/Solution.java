package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        reader = new BufferedReader(new InputStreamReader(fis));
        String line = "";
        while ((line = reader.readLine())!=null){
            if (line.startsWith(args[0] + " ")) {
                System.out.println(line);
                break;
            }
        }
        reader.close();
        fis.close();


    }
}
