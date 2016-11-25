package com.javarush.test.samples.multithreading.onethread.javaclocks;

import javax.swing.*;

/**
 * Created by prulov on 24.11.2016.
 */
public class ClockLauncher
{
    public static void main(String[] args)
    {
        StartStopClock stCl = new StartStopClock();
        JavaClock1 clock1 = new JavaClock1();
        JavaClock2 clock2 = new JavaClock2();
        stCl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clock1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clock2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stCl.setVisible(true);
        clock1.setVisible(true);
        clock2.setVisible(true);

        if(!clock2.getAlienThread().isInterrupted()){
            clock2.getAlienThread().interrupt(); // clock2 will stopped because of method interrupt() invocation
        }

        if(!clock1.getMyThread().isInterrupted()){
            clock1.getMyThread().interrupt();// will not stopped until the method run should be fully executed (stopClock())
        }
    }
}
