package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок10 тысяч удалений и вставок
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только 5 методов.
4. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
5. Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
6. Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
7. Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        int i=0;
        while (true){
            i++;
            list.add(new Object());
            if (i==10000) {
                break;
            }
        }

    }

    public static void get10000(List list) {
        //напишите тут ваш код
        int i=0;
        while (true){
            list.get(i);
            i++;
            if (i==10000) {
                break;
            }
        }

    }

    public static void set10000(List list) {
        //напишите тут ваш код
        int i=0;
        while (true){
            list.set(i, new Object());
            i++;
            if (i==10000) {
                break;
            }
        }

    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        int i=10000;
        while (true) {
            i--;
            list.remove(i);

            if (i == 0) {
                break;
            }
        }

    }
}
