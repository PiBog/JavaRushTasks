package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human son1 = new Human();
        son1.name="Tim";
        son1.sex=true;
        son1.age=10;

        Human son2 = new Human();
        son2.name="Ted";
        son2.sex = true;
        son2.age=11;

        Human doght = new Human();
        doght.name="Berta";
        doght.sex=false;
        doght.age = 9;

        Human fath = new Human();
        fath.name="Brian";
        fath.sex=true;
        fath.age = 35;
        fath.children.add(son1);
        fath.children.add(son2);
        fath.children.add(doght);

        Human math = new Human();
        math.name ="Helena";
        math.sex=false;
        math.age = 33;
        math.children.add(son1);
        math.children.add(son2);
        math.children.add(doght);

        Human gff = new Human();
        gff.name="Bil";
        gff.sex = true;
        gff.age = 65;
        gff.children.add(fath);

        Human gmf = new Human();
        gmf.name="Tracy";
        gmf.sex=false;
        gmf.age=62;
        gmf.children.add(fath);

        Human gfm = new Human();
        gfm.name ="Billy";
        gfm.sex=true;
        gfm.age = 69;
        gfm.children.add(math);

        Human gmm = new Human();
        gmm.name="Olha";
        gmm.sex=false;
        gmm.age = 63;
        gmm.children.add(math);

        /*------------------------*/
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(doght.toString());
        System.out.println(fath.toString());
        System.out.println(math.toString());
        System.out.println(gff.toString());
        System.out.println(gmf.toString());
        System.out.println(gmm.toString());
        System.out.println(gfm.toString());

    }

    public static class Human {
        //напишите тут ваш код
         String name = "";
         boolean sex; //по замовчуванню Фелс - жіночий
         int age = 0;
         ArrayList<Human> children = new ArrayList<>();

        /*public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }*/

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

