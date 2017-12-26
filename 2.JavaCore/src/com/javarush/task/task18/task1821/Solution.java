package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
//import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream(args[0]);
        //FileInputStream fis = new FileInputStream("d:\\in.txt");
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        while (fis.available() > 0) {
            int i = fis.read();
            if (!map.containsKey(i))
                map.put(i, 1);
            else map.put(i, map.get(i) + 1);
        }
        fis.close();

        //TreeSet<Byte> symb = new TreeSet<>(frequency.keySet());

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            int c = pair.getKey();
            System.out.println((char)c + " " + pair.getValue());

        }

    }

}
