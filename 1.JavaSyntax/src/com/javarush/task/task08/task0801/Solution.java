package com.javarush.task.task08.task0801;

/* 
HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
Требования:
1. Объяви переменную коллекции HashSet с типом элементов String и сразу проинициализируй ee.
2. Программа не должна считывать строки с клавиатуры.
3. Программа должна добавлять в коллекцию 10 строк, согласно условию.
4. Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> sett = new HashSet<String>(10);
        sett.add("арбуз");
        sett.add("банан");
        sett.add("вишня");
        sett.add("груша");
        sett.add("дыня");
        sett.add("ежевика");
        sett.add("жень-шень");
        sett.add("земляника");
        sett.add("ирис");
        sett.add("картофель");

        for (String name: sett){
            System.out.println(name);
        }




    }
}
