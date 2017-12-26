package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        FileInputStream fis = null;
        try{
            while (true) {
                fileName = reader.readLine();
                fis = new FileInputStream(fileName);
                fis.close();
            }
        } catch (FileNotFoundException fnfe) {

            reader.close();
            System.out.println(fileName);
        }

    }
}
