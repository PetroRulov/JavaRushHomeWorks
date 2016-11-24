package com.javarush.test.samples.multithreading.onethread;

/**
 * Created by prulov on 24.11.2016.
 */
public class SimpleThreadManager
{
    public static void main(String[] args)
    {
        // Запускаем 3(три) потока
        for (int i = 0; i < 3; i++)
        {
            Thread first = new SimpleThread();
            first.start();
        }

        //Запускаем 4(четыре) новых потока ч/з SimpleRunnable
        for (int i = 0; i < 4; i++)
        {
            Runnable runnable = new SimpleRunnable();
            Thread potok = new Thread(runnable);
            potok.start();
        }
    }
}
