package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
11
3
2
10

Пример вывода:
2
8
10


Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
3. Программа должна выводить данные на экран.
4. Программа должна закрывать поток чтения из файла(FileInputStream).
"d:\java.txt"*/

import java.io.*;
import java.util.*;
//import java.lang.Character;

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
        Scanner scanFile = new Scanner(inputStream);
        List<Integer> inList = new ArrayList<Integer>();
        int j;
        while (scanFile.hasNextInt()) {
            j = scanFile.nextInt();
            if (j%2 == 0) inList.add(j);
        }
        reader.close();
        inputStream.close();
        scanFile.close();
/*
        InputStream inputStream = new FileInputStream(reader.readLine());
        Character a;
        while (inputStream.available()>0) {
            a = (char) inputStream.read();
            if (Character.isDigit(a)) {
                int c = Character.getNumericValue(a);
                if (c%2==0) {
                    inList.add(c);
                }
            }
        }
/*
        for (int i=0; i<inList.size(); i++) {
            System.out.println(inList.get(i));
        }
*/


        Collections.sort(inList, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        int b;
        //String c="";
        for (int i=0; i<inList.size(); i++) {
            b=inList.get(i);
            System.out.println(b);
            /*if (b%2==0) {
                //c += b + " ";
            }*/
        }

        //inputStream.close();


    }
}