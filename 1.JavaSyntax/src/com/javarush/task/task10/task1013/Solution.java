package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private boolean sex;
        private int age;
        private String name;
        private String surname;
        private  String addres;
        private String hairColor;

        public Human(){
            this.sex = true;
            this.age = 0;
            this.name = "John";
            this.surname = "Doe";
            this.addres = "Unknown";
            this.hairColor = "Unknown";
        }

        public Human(boolean sex, int age, String name, String surname, String addres, String hairColor){
            this.sex = sex;
            this.age = age;
            this.name = name;
            this.surname = surname;
            this.addres = addres;
            this.hairColor = hairColor;
        }

        public Human(boolean sex, int age){
            this.sex = sex;
            this.age = age;
            this.name = "John";
            this.surname = "Doe";
            this.addres = "Unknown";
            this.hairColor = "Unknown";
        }

        public Human(String name, String surname){
            this.sex = true;
            this.age = 0;
            this.name = name;
            this.surname = surname;
            this.addres = "Unknown";
            this.hairColor = "Unknown";
        }

        public Human(String name, String surname, String addres){
            this.sex = true;
            this.age = 0;
            this.name = name;
            this.surname = surname;
            this.addres = addres;
            this.hairColor = "Unknown";
        }

        public Human(String name, String surname, String addres, String hairColor){
            this.sex = true;
            this.age = 0;
            this.name = name;
            this.surname = surname;
            this.addres = addres;
            this.hairColor = hairColor;
        }

        public Human(boolean sex, int age, String hairColor){
            this.sex = sex;
            this.age = age;
            this.name = "John";
            this.surname = "Doe";
            this.addres = "Unknown";
            this.hairColor = hairColor;
        }

        public Human(String addres){
            this.sex = true;
            this.age = 0;
            this.name = "John";
            this.surname = "Doe";
            this.addres = addres;
            this.hairColor = "Unknown";
        }

        public Human(boolean sex, String name){
            this.sex = sex;
            this.age = 0;
            this.name = name;
            this.surname = "Doe";
            this.addres = "Unknown";
            this.hairColor = "Unknown";
        }

        public Human(int age, String name){
            this.sex = true;
            this.age = age;
            this.name = name;
            this.surname = "Doe";
            this.addres = "Unknown";
            this.hairColor = "Unknown";
        }


    }
}
