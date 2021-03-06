package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> numbs = new ArrayList<Integer>();
        ArrayList<Integer> num3 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> numother = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<20; i++) {
            Integer s = Integer.parseInt(reader.readLine());
            numbs.add(s);
        }

        for (int i=0; i<numbs.size(); i++){
            if ((numbs.get(i)%3==0)&&(numbs.get(i)%2==0)){
                num3.add(numbs.get(i));
                num2.add(numbs.get(i));
            }
            else if ((numbs.get(i)%3==0)&&(numbs.get(i)%2!=0))num3.add(numbs.get(i));
            else if ((numbs.get(i)%3!=0)&&(numbs.get(i)%2==0))num2.add(numbs.get(i));
            else numother.add(numbs.get(i));
        }

        printList(num3);
        printList(num2);
        printList(numother);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i=0; i<list.size(); i++) System.out.println(list.get(i));
    }
}
