package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fName = reader.readLine();
        reader.close();
        if (args[0].equals("-c")) crud(fName, args);
    }

    public static String getNextId(String fName) throws IOException{
        FileInputStream fis = new FileInputStream(fName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
        String line1;
        String line2 = "";
        while ((line1 = reader.readLine())!= null){
            line2 = line1;
        }
        reader.close();
        fis.close();
        int getNumb = Integer.parseInt(line2.substring(0,8).trim());
        return Integer.toString(getNumb+1);
    }

    public static String fillAndTrim (String lineIn, int length){
        String line = lineIn;
        if (line.length() > length) {
            return line.substring(0, length);
        } else if (line.length() == length) {
            return line;
        }else {
            for (int i = line.length(); i < length ; i++){
                line += " ";
            }
            return line;
        }
    }

    public static void crud(String fName, String args[]) throws IOException{
        String id = getNextId(fName);
        FileOutputStream fos = new FileOutputStream (fName, true);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
        String lineToWrite = fillAndTrim(id, 8) + fillAndTrim(args[1], 30) + fillAndTrim(args[2], 8) + fillAndTrim(args[3], 4);
        writer.write(lineToWrite);
        writer.close();
    }
}
