package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();
        for (int i=0; i<10; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s =reader.readLine();
            str.add(s);
        }
        int min=0, max=0;
        for (int i=1; i<str.size(); i++){
            String s = str.get(i);
            String sn = str.get(min);
            String sx = str.get(max);
            if (s.length()<sn.length()) min =i;
            if (s.length()>sx.length()) max=i;

        }

        if (min<max) System.out.println(str.get(min));
        else System.out.println(str.get(max));
    }
}
