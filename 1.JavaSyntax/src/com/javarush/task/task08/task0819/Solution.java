package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.


Требования:
1. Программа должна выводить текст на экран.
2. Внутри класса Solution должен быть public static класс Cat.
3. Метод createCats() класса Solution должен возвращать множество (Set) содержащее 3 кота.
4. Метод printCats() класса Solution должен вывести на экран всех котов из множества. Каждый кот с новой строки.
5. Метод main() должен вызывать метод createCats().
6. Метод main() должен вызывать метод printCats().
7. Метод main() должен удалять одного кота из множества котов.
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3

        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> kity = new HashSet<Cat>();
        for (int i=0; i<3; i++) kity.add(new Cat());

        /*Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        kity.add(new Cat());
        kity.add(c2);
        kity.add(c3);*/
        return kity;
        //return null;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        Iterator iterator = cats.iterator();
        while (iterator.hasNext()) {
           // Cat c=(Cat) iterator.next();
            System.out.println(iterator.next());
        }
    }


    public  static class Cat {
      /*  //private String name;

       // public String getName() {
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public Cat(String name){
            this.name = name;
        }*/
    }// step 1 - пункт 1
}
