package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.trim();
        //напишите тут ваш код
        String s1 = new String();
        char[] sChar = s.toCharArray();
        sChar[0]=Character.toUpperCase(sChar[0]);
        for (int i=0; i <sChar.length; i++){
            if (Character.isWhitespace(sChar[i])) {
                sChar[i+1]=Character.toUpperCase(sChar[i+1]);
            }
            s1=s1+sChar[i];
        }

        System.out.println(s1);

    }
}
