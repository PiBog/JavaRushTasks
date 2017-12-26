package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
5. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("SMIT", 100);
        map.put("SMIT1", 1000);
        map.put("SMIT2", 1000);
        map.put("SMIT3", 100);
        map.put("SMIT4", 1000);
        map.put("SMIT5", 1000);
        map.put("SMIT6", 100);
        map.put("SMIT7", 1000);
        map.put("SMIT8", 100);
        map.put("SMIT9", 1000);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copyMap = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> iter: copyMap.entrySet()){
            if (iter.getValue()<500) map.remove(iter.getKey());
        }
    }

    public static void main(String[] args) {

    }
}