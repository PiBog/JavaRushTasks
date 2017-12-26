package com.javarush.task.task16.task1632;

public class FourthThread extends Thread implements Message {

    @Override
    public void showWarning() {
        interrupt();
    }

    @Override
    public void run() {
        while (!isInterrupted()){}
    }
}
