package com.javarush.task.task13.task1318;

import java.io.*;

public class Solution {
    public static void main(String[] args){


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String output = "";
        try (InputStream inStrim = new FileInputStream(reader.readLine())){
            while (inStrim.available() > 0) {
                output += (char) inStrim.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(output);

    }
}


