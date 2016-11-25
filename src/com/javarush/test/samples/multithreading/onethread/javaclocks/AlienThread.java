package com.javarush.test.samples.multithreading.onethread.javaclocks;

public class AlienThread extends Thread
{
    private Threadable clock;

    public void setClock(Threadable clock)
    {
        this.clock = clock;
    }

    @Override
    public void run(){
        while (!Thread.interrupted()) {
            clock.setTime();
            //System.out.println(this.toString() + " is flows");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                //System.out.printf("AllienThread %s interrupted\n", name);
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    public String toString()
    {
        return "AlienThread{}";
    }
}
