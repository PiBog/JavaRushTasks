package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
1. В отдельных файлах создать классы Plane и Helicopter, реализующие интерфейс Flyable.
2. Класс Plane должен иметь конструктор с параметром int — количество перевозимых пассажиров.
3. В статическом методе reset класса Solution:
3.1. Считать с консоли параметр типа String.
3.2. Если параметр равен «helicopter«, то статическому объекту Flyable result присвоить объект класса Helicopter.
3.3. Если параметр равен «plane«, то считать второй параметр типа int(количество пассажиров), статическому объекту
Flyable result присвоить объект класса Plane.
4. В статическом блоке инициализировать Flyable result вызвав метод reset.
5. Закрыть поток ввода методом close().
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String airCraft = reader.readLine();
            if (airCraft.equals("plane")) {
                int countPass = Integer.parseInt(reader.readLine());
                result = new Plane(countPass);
            } else if (airCraft.equals("helicopter")) {
                result = new Helicopter();
            } else System.out.println("Unknown air vehicle");
            reader.close();
        } catch (IOException e) { }
    }
}
