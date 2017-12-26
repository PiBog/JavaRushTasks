package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] numb = new int[10];
        for (int i=0; i<numb.length; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            numb[i]=Integer.parseInt(reader.readLine());
        }

        for (int i=0; i<numb.length; i++){
            System.out.println(numb[numb.length-i-1]);
        }
    }
}

