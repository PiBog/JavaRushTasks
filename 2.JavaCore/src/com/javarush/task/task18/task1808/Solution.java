package com.javarush.task.task18.task1808;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            String file3 = reader.readLine();
            FileInputStream inputStream = new FileInputStream(file1);
            FileOutputStream outputStream1 = new FileOutputStream(file2);
            FileOutputStream outputStream2 = new FileOutputStream(file3);
            int length = inputStream.available();
            byte[] buff = new byte[length];
            int count = inputStream.read(buff, 0, (length-length/2));
            outputStream1.write(buff, 0, count);
            count = inputStream.read(buff);
            outputStream2.write(buff, 0, count);
            reader.close();
            inputStream.close();
            outputStream1.close();
            outputStream2.close();

        } catch (IOException iex) {
            iex.printStackTrace();
        }

    }
}
