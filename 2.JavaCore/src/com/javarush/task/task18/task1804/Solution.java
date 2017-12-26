package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> byteMape = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream sourceFile = new FileInputStream(reader.readLine());
        Integer currentByte, freqCount, minFreqCount =0;

        while (sourceFile.available() > 0) {
            currentByte = sourceFile.read();
            //System.out.print(currentByte + " ");
            freqCount = byteMape.get(currentByte);
            byteMape.put(currentByte, freqCount == null ? 1 : freqCount+1);

        }
        //System.out.println();
        reader.close();
        sourceFile.close();

        String outString = "";
        int minValue = minValue(byteMape);
        for (Map.Entry<Integer, Integer> entry: byteMape.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            //System.out.print(key + ":" + value +" " );
            if (value == minValue) outString += (key + " ");
        }

        //System.out.println();
        System.out.println(outString );
    }

    private static int minValue(Map<Integer, Integer> valueMap) {
        int minValue = Integer.MAX_VALUE;
        for (int value : valueMap.values()){
            if (value < minValue) minValue = value;
        }
        return minValue;
    }
}
