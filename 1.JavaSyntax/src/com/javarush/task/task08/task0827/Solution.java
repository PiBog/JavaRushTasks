package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года — нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

public class Solution {
    public static void main(String[] args) {


        System.out.println(isDateOdd("MAY 3 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date date2 = new Date(date);
        date2.setDate(1);
        date2.setMonth(0);
        //Boolean res;
        long time1 =  date1.getTime();
        //System.out.println(time1);
        long time2 =  date2.getTime();
        //System.out.println(time2);
        int res = (int) ((time1-time2)/(1000*60*60*24))+1;
        //System.out.println(res+", "+res%2);
        return (res%2!=0);

    }
}
