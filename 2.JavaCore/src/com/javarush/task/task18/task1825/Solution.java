package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws  IOException{
        /*

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String[]> fileList = new ArrayList<>();
        String fileName = reader.readLine();
        while (!fileName.equals("end")){
            fileList.add(fileName.split(".part"));
            fileName = reader.readLine();
        }
        reader.close();

        //sort list with arrays of file names by growth(increase)
        for (int i = 0 ; i < fileList.size(); i++){
            for (int j = 1; j < fileList.size(); j++){
                int ii = Integer.parseInt(fileList.get(i)[1]);
                int ij = Integer.parseInt(fileList.get(j)[1]);
                if (ii > ij) {
                    String[] tmp = fileList.get(j);
                    fileList.set(j, fileList.get(i));
                    fileList.set(i, tmp);
                }
            }
        }

        //create output stream

        FileOutputStream fos = new FileOutputStream(fileName.split(".part")[0]);

        for (int i = 0; i < fileList.size(); i++){
            String[] fil = fileList.get(i);
            FileInputStream fis = new FileInputStream(fil[0]+".part"+fil[1]);
            while (fis.available() > 0){
                byte[] b = new byte[1000];
                int n = fis.read(b);
                fos.write(b, 0, n);
            }
            fis.close();
        }

        fos.close();
        */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        TreeMap<Integer, String> files = new TreeMap<>();
        String path = "";

        while (!(s = reader.readLine()).equals("end"))
        {
            files.put(Integer.parseInt(s.substring(s.lastIndexOf("t") + 1, s.length())), s);
        }
        reader.close();

        s = files.values().toArray()[0].toString();
        path = s.substring(0, s.lastIndexOf("."));

        FileOutputStream outputStream = new FileOutputStream(path);
        //FileInputStream inputStream = null;
        for (Map.Entry<Integer, String> file : files.entrySet())
        {
            FileInputStream inputStream = new FileInputStream(file.getValue());
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
            inputStream.close();
        }
        outputStream.close();


    }
}
