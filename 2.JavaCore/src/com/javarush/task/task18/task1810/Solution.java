package com.javarush.task.task18.task1810;

/* 
DownloadException
DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки работы с файлами.
2.2 Выбросить исключение DownloadException.


Требования:
1. Программа должна считать имена файлов с консоли.
2. Для чтения из файлов используй поток FileInputStream.
3. Программа должна работать, пока введенный файл не окажется меньше 1000 байт.
4. Программа должна завершиться исключением DownloadException.
5. Поток FileInputStream должен быть закрыт.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            //FileInputStream inputStream = null;
            //int size = 0;
            //boolean trueSize = true;
            String fileName = reader.readLine();
            while (!fileName.isEmpty()) {
                FileInputStream inputStream = new FileInputStream(fileName);
                int size = inputStream.available();
                if (size < 1000) {
                    //trueSize = false;
                    inputStream.close();
                    reader.close();
                    throw new DownloadException();
                } else {
                    inputStream.close();
                    fileName = reader.readLine();
                }
            }
            //inputStream.close();
            throw new DownloadException();
        } catch (IOException iex) {
            iex.printStackTrace();
        }
    }

    public static class DownloadException extends Exception {

    }
}
