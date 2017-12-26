package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 9, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.


Требования:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++) list.add(Integer.parseInt(buffer.readLine()));
        int seq=1;
        int tmpSeq=1;

        for (int i=1; i<list.size(); i++){
            if (list.get(i).equals(list.get(i-1))) {
                tmpSeq++;
                if (tmpSeq>seq) seq=tmpSeq;}
            else {
               // if (tmpSeq>seq) seq=tmpSeq;
                tmpSeq=1;
            }
        }
        System.out.println(seq);


    }
}