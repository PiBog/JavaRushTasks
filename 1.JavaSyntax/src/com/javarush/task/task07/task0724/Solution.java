package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human gff = new Human("Bob",true,80);
        Human gfm = new Human("Jack",true,81);
        Human gmf = new Human("Marry",false,79);
        Human gmm = new Human("Dorothy",false,85);
        Human f = new Human("Tom",true,50, gff, gmf);
        Human m = new Human("Molly",false,49,gfm,gmm);
        Human son1 = new Human("Tymmi",true,28,f,m);
        Human son2 = new Human("Pete",true,26,f,m);
        Human dot = new Human("Shaila",false,33,f,m);
        System.out.println(gff.toString());
        System.out.println(gfm.toString());
        System.out.println(gmf.toString());
        System.out.println(gmm.toString());
        System.out.println(f.toString());
        System.out.println(m.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(dot.toString());

    }

    public static class Human {

        //Создай класс Human с полями имя(String), пол(boolean),
        // возраст(int), отец(Human), мать(Human).
        // Создай объекты и заполни их так, чтобы получилось: Д
        // ва дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex=sex;
            this.age=age;

        }


        public Human (String name, boolean sex, int age, Human father, Human mother ){
            this.name = name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















