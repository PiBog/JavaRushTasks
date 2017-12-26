package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread,
работающим со своим объектом класса SpecialThread.


Требования:
1. В методе main создай 5 объектов типа SpecialThread.
2. В методе main создай 5 объектов типа Thread.
3. Добавь 5 разных нитей в список list.
4. Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
5. Метод run класса SpecialThread должен выводить "it's a run method inside SpecialThread".
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread sT1 = new SpecialThread();
        SpecialThread sT2 = new SpecialThread();
        SpecialThread sT3 = new SpecialThread();
        SpecialThread sT4 = new SpecialThread();
        SpecialThread sT5 = new SpecialThread();

        Thread th1 = new Thread(sT1);
        Thread th2 = new Thread(sT2);
        Thread th3 = new Thread(sT3);
        Thread th4 = new Thread(sT4);
        Thread th5 = new Thread(sT5);

        list.add(th1);
        list.add(th2);
        list.add(th3);
        list.add(th4);
        list.add(th5);

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
