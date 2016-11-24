package com.javarush.test.samples.multithreading.onethread;

/**
 * Created by prulov on 24.11.2016.
 */
public class SimpleRunnable implements Runnable
{
    @Override
    public void run()
    {
        try{
            long pause = Math.round(Math.random()*2000);
            Thread.sleep(pause);
            System.out.println(Thread.currentThread().toString() + " SimpleRunnable thread pause = " + pause + " ms.");
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
