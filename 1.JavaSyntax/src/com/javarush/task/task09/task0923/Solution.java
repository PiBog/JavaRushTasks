package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().replace(" ","");
        //System.out.println(str);
        char[] chAr = str.toCharArray();
        String str1 = "";
        String str2 = "";

        for (int i=0; i<chAr.length; i++){
            if (isVowel(chAr[i])) {
                str1 = str1+chAr[i]+" ";
            } else {
                str2 = str2+chAr[i]+" ";
            }
        }
        System.out.println(str1);
        System.out.println(str2);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}