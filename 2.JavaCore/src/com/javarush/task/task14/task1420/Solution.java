//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public Solution() {
    }

    public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] nsd = new int[2];
            int a = Integer.parseInt(reader.readLine());
            if (a<=0) throw new ArithmeticException();
            int b = Integer.parseInt(reader.readLine());
            if (b<=0) throw new ArithmeticException();
            if (a > b) {
                nsd[0] = a;
                nsd[1] = b;
            } else {
                nsd[0] = b;
                nsd[1] = a;
            }

            System.out.println(algOfEvklid(nsd));


    }

    public static int algOfEvklid(int[] nsd1) {
        boolean var1 = false;

        while(nsd1[0] != nsd1[1] && nsd1[0] % nsd1[1] != 0) {
            int r = nsd1[0] - nsd1[1];
            if (r > nsd1[1]) {
                nsd1[0] = r;
            } else {
                nsd1[0] = nsd1[1];
                nsd1[1] = r;
            }
        }

        return nsd1[1];
    }
}
