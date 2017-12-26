package com.javarush.task.task14.task1419;

import com.sun.org.apache.xerces.internal.impl.dv.xs.SchemaDateTimeException;

import javax.xml.transform.TransformerException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.lang.Integer;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        //it's second exception
        try {
            String[] list = new String[0];
            list[1] ="1";

        } catch (Exception e) {
            exceptions.add(e);
        }

        //it's third exception
        try {
            String a = null;
            System.out.println(a.length());

        } catch (Exception e) {
            exceptions.add(e);
        }

        //it's fourth exception
        try {
            Object x = new Integer(0);
            System.out.println((String)x);

        } catch (Exception e) {
            exceptions.add(e);
        }

        //it's fifth exception
        try {
            String[] list = new String[-2];

        } catch (Exception e) {
            exceptions.add(e);
        }

        //it's sixth exception
        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);

        } catch (Exception e) {
            exceptions.add(e);
        }

        //it's seventh exception
        try {
            throw new InterruptedException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //it's eigth exception
        try {
            throw new SchemaDateTimeException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //it's ninth exception
        try {
            throw new EmptyStackException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //it's tenth exception
        try {
            throw new IllegalStateException();

        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
