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
            try {
                Thread.sleep(500);
                //System.out.println(Thread.currentThread().toString());
            } catch (Exception e) {
                // do nothing;
            }
        }
    }
}
