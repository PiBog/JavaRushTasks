package com.javarush.task.task18.task1809;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream inputStream = new FileInputStream(reader.readLine());
            FileOutputStream outputStream = new FileOutputStream(reader.readLine());
            reader.close();
            byte[] buff = new byte[inputStream.available()];
            int count = inputStream.read(buff);
            for (int i=count; i > 0; i--){
                outputStream.write(buff[i-1]);
            }
            inputStream.close();
            outputStream.close();

        } catch (Exception exeption) {
            exeption.printStackTrace();
        }

    }
}
