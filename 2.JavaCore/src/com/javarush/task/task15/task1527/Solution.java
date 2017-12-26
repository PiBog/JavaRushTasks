package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        //http://proglang.su/java/modifiers?category=java&alias=143   ========
        // category=java & alias=143
        //javarush.ru/alpha/index.html?lvl=15&view&name=Aobjmigo&obj=3.14&name=&obj=djsdcd&oobj=3.0&obj=1&obj=2.3&obj=aaa
        //javarush.ru/alpha/index.html?obj=3.14&name=Amigo

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String url = reader.readLine();
            reader.close();


        if (url.contains("?")) {
            List<String> paramList = new ArrayList<String>();
            int indexParamPosition = url.indexOf("?");
            String subUrl = url.substring(indexParamPosition+1);


            while (subUrl.contains("&")){
                indexParamPosition = subUrl.indexOf("&");
                paramList.add(subUrl.substring(0,indexParamPosition));
                subUrl = subUrl.substring(indexParamPosition+1);
            }
            paramList.add(subUrl);

            for (String listLine : paramList){
                System.out.print(listLine.replaceAll("=.*", "") + " ");
            }

            for (String listLine : paramList){
                if (listLine.startsWith("obj=")) {
                    String alarm = listLine.replaceAll("obj=","");
                    if (checkString(alarm)) {alert(Double.parseDouble(alarm));}
                    else {alert(alarm);}
                }
            }




        }


        }  catch (Exception e) {
            System.out.println("!?!?!?!");
        }


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }

    public static boolean checkString(String string) {
        try {
            Double.parseDouble(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
