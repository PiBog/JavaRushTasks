package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» — «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String
состоящих из 10 записей по принципу «Фамилия» - «Имя».
5. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
6. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> spisok = new HashMap<String, String>();
        spisok.put("Smit", "Jone");
        spisok.put("Smit1", "Jone1");
        spisok.put("Smit2", "Jone1");
        spisok.put("Smit3", "Jone2");
        spisok.put("Smit4", "Jone2");
        spisok.put("Smit5", "Jone");
        spisok.put("Smit6", "Jone");
        spisok.put("Smit7", "Jone4");
        spisok.put("Smit8", "Jone");
        spisok.put("Smit9", "Jone");
        return spisok;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        //Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
        //return map.values().contains(name);
        Iterator<String> iterat = map.keySet().iterator();
        int count =0;
        while(iterat.hasNext())
        {
            if (name.equals(map.get(iterat.next()))) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код

        if (map.keySet().contains(lastName)) return 1;
        else return 0;

    }

    public static void main(String[] args) {

    }
}
