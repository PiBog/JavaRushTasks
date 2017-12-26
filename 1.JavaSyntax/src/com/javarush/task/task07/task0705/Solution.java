package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] big = new int[20];
        for (int i=0; i<big.length; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            big[i]=Integer.parseInt(reader.readLine());
        }

        int[] smal1=new int[10];
        int[] smal2=new int[10];
        for (int i=0; i<smal1.length; i++){
            smal1[i]=big[i];
            smal2[i]=big[i+10];
        }

        for (int i=0; i<smal2.length; i++){System.out.println(smal2[i]);}
    }
}
