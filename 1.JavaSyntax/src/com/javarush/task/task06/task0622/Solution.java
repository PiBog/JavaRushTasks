package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код

        ArrayList<Integer> numbs = new ArrayList<Integer>();

        for (int i=0; i<5; i++){
            numbs.add(Integer.parseInt(reader.readLine()));
        }

        for (int i=0; i<numbs.size(); i++){
            int min=numbs.get(i);
            for (int j=i+1; j<numbs.size(); j++){
                int eq = numbs.get(j);
                if (eq < min){
                    numbs.set(i, eq);
                    numbs.set(j, min);
                }
            }
        }

        for (int i=0; i<numbs.size(); i++){
            System.out.println(numbs.get(i));
        }




    }
}
