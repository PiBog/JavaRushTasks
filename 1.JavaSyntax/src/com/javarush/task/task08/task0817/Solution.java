package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» — «имя».
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
5. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
6. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Smit", "Jone");
        map.put("Smit1", "Jones");
        map.put("Smit2", "Jonee");
        map.put("Smit3", "Jonet");
        map.put("Smit4", "Jonem");
        map.put("Smit5", "Joney");
        map.put("Smit6", "Jon");
        map.put("Smit7", "Jone");
        map.put("Smit8", "Jon");
        map.put("Smit9", "Jonee");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        //HashMap<String, String> copy = new HashMap<String, String>(map);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> copyNames = new ArrayList<String>();

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {

            Map.Entry<String, String> entry = iterator.next();

            if (!names.contains(entry.getValue())) names.add(entry.getValue());
            else {
                if (!copyNames.contains(entry.getValue())) copyNames.add(entry.getValue());
            }
         }

         for (int i=0; i<copyNames.size(); i++){
                    removeItemFromMapByValue(map, copyNames.get(i));

         }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
       /* HashMap<String,String> mapa = createMap();
        removeTheFirstNameDuplicates(mapa);

        for (Map.Entry<String, String> pair : mapa.entrySet()) {
            System.out.println(pair.getValue());
        }
        System.out.println("end");*/

    }
}
