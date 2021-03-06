package com.javarush.test.samples.multithreading.onethread.javaclocks;

public class MyThread extends Thread {

    private Threadable clock;
    private volatile boolean isRunning = true;

    public void setClock(Threadable clock)
    {
        this.clock = clock;
    }

    public void stopClock() {
        isRunning = false;
    }

    @Override
    public void run() {
        while (isRunning) {
            clock.setTime();
            //System.out.println(this.toString() + " is flows");
            try {
                Thread.sleep(500);

            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    public String toString()
    {
        return "MyThread{}";
    }
}
