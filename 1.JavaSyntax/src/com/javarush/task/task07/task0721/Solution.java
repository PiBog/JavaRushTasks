package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
Требования:
1. Создай массив целых чисел (int[]) на 20 элементов.
2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
3. Найди и выведи через пробел максимальное и минимальное числа.
4. Используй цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum; //=Integer.MIN_VALUE;
        int minimum ;//=Integer.MAX_VALUE;

        //напишите тут ваш код

        int[] mas = new int[20];
        for (int i=0; i<mas.length; i++) {
            mas[i]=Integer.parseInt(reader.readLine());
            //if (mas[i]>maximum) maximum=mas[i];
            //if (mas[i]<minimum) minimum=mas[i];
        }

        maximum=mas[0];
        minimum=mas[0];

        for (int i=1; i<mas.length; i++) {
            if (mas[i]>maximum) maximum=mas[i];
            if (mas[i]<minimum) minimum=mas[i];
        }

        System.out.println(maximum+" "+minimum);




       // System.out.println(maximum);
        //System.out.println(minimum);
    }
}
