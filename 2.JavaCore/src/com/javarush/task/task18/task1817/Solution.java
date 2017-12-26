package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
//import java.math.BigDecimal;
//import java.math.RoundingMode;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int wsCount = 0, count = 0;
        while (fileInputStream.available() > 0) {
            int bite = fileInputStream.read();
            count++;
            if (bite == 32) wsCount++;
        }
        fileInputStream.close();
        //double div = new BigDecimal(wsCount/count*100).setScale(2, RoundingMode.HALF_UP).doubleValue();
        //System.out.println(div);
        float result = (float) ((float)wsCount/count*100.0);

        System.out.println(String.format(Locale.ENGLISH, "%.2f", result));

    }
}
