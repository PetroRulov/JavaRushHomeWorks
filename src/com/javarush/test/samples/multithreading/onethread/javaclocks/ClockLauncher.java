package com.javarush.test.samples.multithreading.onethread.javaclocks;

import javax.swing.*;

/**
 * Created by prulov on 24.11.2016.
 */
public class ClockLauncher
{
    public static void main(String[] args)
    {
//        JavaClock1 clock1 = new JavaClock1();
//        JavaClock2 clock2 = new JavaClock2();
//        clock1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        clock2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        clock1.setVisible(true);
//        clock2.setVisible(true);

        StartStopClock stCl = new StartStopClock();
        stCl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stCl.setVisible(true);
    }
}
