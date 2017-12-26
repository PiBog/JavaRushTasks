package com.javarush.task.task16.task1632;

//import sun.swing.BakedArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FivethThread extends Thread {
    public List<Integer> list = new ArrayList<>();

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = "";
            while (!(line = reader.readLine()).equals("N")) {
                list.add(Integer.parseInt(line));
            }
            reader.close();

        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        int sum=0;
        for (int num : list){
            sum += num;
        }
        System.out.println(sum);
    }
}
