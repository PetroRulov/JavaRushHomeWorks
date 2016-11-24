package com.javarush.test.samples.multithreading.onethread;

public class SimpleThread extends Thread {

    @Override
    public void run(){
        try{
            long pause = Math.round(Math.random()*2000);
            Thread.sleep(pause);
            System.out.println(Thread.currentThread().toString() + " Simple Thread - pause = " + pause);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}