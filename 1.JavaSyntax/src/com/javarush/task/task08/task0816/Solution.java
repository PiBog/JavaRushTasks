package com.javarush.task.task08.task0816;

import javax.print.DocFlavor;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» — «дата рождения».
Удалить из словаря всех людей, родившихся летом.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
5. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date(1984, 12, 11));
        map.put("Stallone1", new Date(1967, 07, 4));
        map.put("Stallone2", new Date(1985, 06, 30));
        map.put("Stallone3", new Date(1990, 10,10));
        map.put("Stallone4", new Date(1990, 10,10));
        map.put("Stallone5", new Date(1990, 10,10));
        map.put("Stallone6", new Date(1985, 11,11));
        map.put("Stallone7", new Date(1990, 1,16));
        map.put("Stallone8", new Date(1990, 10,10));
        map.put("Stallone9", new Date(1990, 10,10));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        //Date startSum = new Date();

        HashMap<String, Date> copy = new HashMap<String, Date>(map);
        for (Map.Entry<String, Date> pair: copy.entrySet()){
            if ((pair.getValue().getMonth()>4)&&(pair.getValue().getMonth()<8)) {
                map.remove(pair.getKey());
            }
        }



    }

    public static void main(String[] args) {

    }
}
