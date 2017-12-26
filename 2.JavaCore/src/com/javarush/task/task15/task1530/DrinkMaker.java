package com.javarush.task.task15.task1530;

public abstract class DrinkMaker {

    /*
    * 1. В отдельном файле создать класс DrinkMaker с тремя абстрактными методами:
— void getRightCup() — выбрать подходящую чашку
— void putIngredient() — положить ингредиенты
— void pour() — залить жидкостью*/

    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }

}
