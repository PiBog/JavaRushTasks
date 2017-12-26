package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    public Cat()
    {this.catCount++;
    }

    protected void  finalize()
    {this.catCount--;
    }//напишите тут ваш код

    public static void main(String[] args) {

    }
}