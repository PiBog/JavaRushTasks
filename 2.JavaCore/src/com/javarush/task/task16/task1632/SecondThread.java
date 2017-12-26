package com.javarush.task.task16.task1632;

public class SecondThread extends Thread {
    @Override
    public void run() {
        while (!isInterrupted()){}
        System.out.println("InterruptedException");
    }
}
