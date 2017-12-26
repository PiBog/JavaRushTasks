package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
16. Метод readKeyFromConsoleAndInitPlanet должен быть вызван в статическом блоке класса Solution.
17. Метод readKeyFromConsoleAndInitPlanet должен считывать одну строку с клавиатуры.
18. Метод readKeyFromConsoleAndInitPlanet должен корректно обновлять значение переменной thePlanet в соответствии с условием задачи.
*/

public class Solution {
    public static void main(String[] args) {
    //    System.out.println(thePlanet);
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    /*4. В статическом блоке класса Solution вызови метод readKeyFromConsoleAndInitPlanet.*/
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        /*
        5. Реализуй функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считай один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet, создай
соответствующий объект и присвой его Planet thePlanet, иначе обнулить Planet thePlanet.
        * */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String keyPlanet = reader.readLine();
            reader.close();
            if (keyPlanet.equals(Planet.EARTH)) thePlanet = Earth.getInstance();
            else if (keyPlanet.equals(Planet.MOON)) thePlanet = Moon.getInstance();
            else if (keyPlanet.equals(Planet.SUN)) thePlanet = Sun.getInstance();
            else thePlanet = null;
        } catch(IOException e){ }

    }
}
