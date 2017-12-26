package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна использовать коллекции.
5. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nmon = reader.readLine();

        Map<String, Integer> mons = new HashMap<String, Integer>();
        mons.put("January", 1);
        mons.put("February", 2);
        mons.put("March", 3);
        mons.put("April", 4);
        mons.put("May", 5);
        mons.put("June", 6);
        mons.put("July", 7);
        mons.put("August", 8);
        mons.put("September", 9);
        mons.put("October", 10);
        mons.put("November", 11);
        mons.put("December", 12);

        System.out.println(nmon + " is "+mons.get(nmon)+" month");


    }
}
