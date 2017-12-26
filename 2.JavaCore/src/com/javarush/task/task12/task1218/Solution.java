package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
Есть, летать и двигаться
Есть public интерфейсы Fly(летать), Move(передвигаться), Eat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).


Требования:
1. Класс Solution должен содержать интерфейс Fly с одним методом fly().
2. Класс Solution должен содержать интерфейс Move с одним методом move().
3. Класс Solution должен содержать интерфейс Eat с одним методом eat().
4. Собака должна уметь передвигаться и есть.
5. Автомобиль должен уметь передвигаться.
6. Самолет должен уметь передвигаться и летать.
7. Утка должна уметь передвигаться, летать и есть.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public abstract class Dog implements Move, Eat {
    }

    public abstract class Duck implements Move, Eat, Fly {
    }

    public abstract class Car implements Move {
    }

    public abstract class Airplane implements Move, Fly {
    }
}
