package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Character.toLowerCase;
//import static java.lang.Character.toLowerCase;

/* 
Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Выведенный текст должен содержать 33 строки.
4. Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }
        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        // напишите тут ваш код
        /*створимо окремий масив рівний довжиною еталлонному і будемо записувати в нього поіндексно кількість співпадінь
        (boolean) equalsIgnoreCase(String anotherString) - Compares this String to another String, ignoring case considerations.
        (int) compareTo(String anotherString) - Compares two strings lexicographically.
        (char) charAt(int index) - Returns the char value at the specified index.
        (static boolean) isLowerCase(char ch)/isUpperCase(char ch) Determines if the specified character is a lowercase/UpperCase character.
        (String) toString() Returns a String object representing this Character's value.
        */
        int[] abcCount = creatAbcCount();

        for (int al=0; al<list.size(); al++){
            String equal = list.get(al).trim();
            countLetters(equal,abcArray,abcCount);
        }

        printCountLetters(abcArray,abcCount);

    }

    private static int[] creatAbcCount(){
        int[] Count = new int[33];
        for (int i=0; i<33; i++){
            Count[i]=0;
        }
        return Count;
    }

    private static int[] countLetters(String etalon, char[] abc, int[] count) {
        for (int i=0; i<etalon.length(); i++) {
            char getEtalon = toLowerCase(etalon.charAt(i));
            for (int j=0; j<abc.length; j++){
                if (getEtalon==abc[j]) {
                    count[j]++;
                    break;
                }
            }
        }
        return count;
    }

    private static void printCountLetters(char[] abc, int[] count) {
        for (int i=0; i<abc.length; i++){
            System.out.println(abc[i]+" "+count[i]);
        }
    }

}
