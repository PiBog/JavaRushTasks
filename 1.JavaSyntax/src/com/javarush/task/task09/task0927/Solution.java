package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
Есть класс кот – Cat, с полем «имя» (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех котов и вывести его на экран.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен объявлять и инициализировать переменную типа HashMap.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String,Cat> map = new HashMap();
        Cat cat1 = new Cat("Tuz");
        map.put("Tuz", cat1);
        Cat cat2 = new Cat("Tuz1");
        map.put("Tuz1", cat2);
        Cat cat3 = new Cat("Tuz2");
        map.put("Tuz2", cat3);
        Cat cat4 = new Cat("Tuz3");
        map.put("Tuz3", cat4);
        Cat cat5 = new Cat("Tuz4");
        map.put("Tuz4", cat5);
        Cat cat6 = new Cat("Tuz5");
        map.put("Tuz5", cat6);
        Cat cat7 = new Cat("Tuz6");
        map.put("Tuz6", cat7);
        Cat cat8 = new Cat("Tuz7");
        map.put("Tuz7", cat8);
        Cat cat9 = new Cat("Tuz8");
        map.put("Tuz8", cat9);
        Cat cat0 = new Cat("Tuz9");
        map.put("Tuz9", cat0);
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> seCat = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            seCat.add(pair.getValue());

        }
        return seCat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
