package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nGF = reader.readLine();
        Cat catGF = new Cat(nGF);

        String nGM = reader.readLine();
        Cat catGM = new Cat(nGM);

        String nF = reader.readLine();
        Cat catF = new Cat(nF, null, catGF);

        String nM = reader.readLine();
        Cat catM = new Cat(nM, catGM, null);

        String nS = reader.readLine();
        Cat catS = new Cat(nS, catM, catF);

        String nD = reader.readLine();
        Cat catD = new Cat(nD, catM, catF);

        System.out.println(catGF);
        System.out.println(catGM);
        System.out.println(catF);
        System.out.println(catM);
        System.out.println(catS);
        System.out.println(catD);

    }

    public static class Cat {
        private String name;
        private Cat Mom;
        private Cat Dad;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat Mom, Cat Dad) {
            this.name = name;
            this.Mom = Mom;
            this.Dad = Dad;
        }

        @Override
        public String toString() {
            if ((Mom == null)&&(Dad==null))
                return ("Cat name is " + name + ", no mother, no father");
            else if (Mom == null)
                return ("Cat name is " + name + ", no mother, father is " + Dad.name);
            else if (Dad==null)
                return ("Cat name is " + name + ", mother is " + Mom.name + ", no father");
            else
                return ("Cat name is " + name + ", mother is " + Mom.name + ", father is " + Dad.name);
        }
    }

}
/*
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

*/