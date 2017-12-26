package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> byteMape = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream sourceFile = new FileInputStream(reader.readLine());
        int currentByte, freqCount, maxFreqCount = 1 ;

        while (sourceFile.available() > 0) {
            currentByte = sourceFile.read();
            //System.out.print(currentByte + " ");
            if (!byteMape.containsKey(currentByte)) byteMape.put(currentByte, 1);
            else{
                freqCount = byteMape.get(currentByte);
                freqCount++;
                byteMape.put(currentByte, freqCount);
                if (freqCount > maxFreqCount) maxFreqCount = freqCount;
            }
        }
        //System.out.println(maxFreqCount);
        reader.close();
        sourceFile.close();

        String outString = "";
        for (Map.Entry<Integer, Integer> entry: byteMape.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            //System.out.print(key + ":" + value +" " );
            if (value == maxFreqCount) outString += (key + " ");
        }

        //System.out.println();
        System.out.println(outString );
    }
}
