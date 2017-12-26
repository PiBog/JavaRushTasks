package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.arraycopy;

/* 
В убывающем порядке
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.


Требования:
1. Программа должна считывать 20 целых чисел с клавиатуры.
2. Программа должна выводить 20 чисел.
3. Метод main должен вызывать метод sort.
4. Метод sort должен сортировать переданный массив по убыванию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        int [] tmp = new int[array.length];
        System.arraycopy(array, 0, tmp, 0, array.length);
        Arrays.sort(tmp);
        for (int i=0; i<tmp.length; i++) array[i]=tmp[tmp.length-i-1];
        ///System.out.println(tmp[tmp.length-i-1]+"-"+array[i]+"/"+(tmp.length-i-1)+"-"+i);}


    }
}
