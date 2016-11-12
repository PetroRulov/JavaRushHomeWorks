package com.javarush.test.patterns.singleton;

import com.javarush.test.patterns.singleton.simple.Singleton;

/**
 * Created by prulov on 12.11.2016.
 */
public class Launcher
{
    public static void main(String[] args)
    {
        //simple Sigleton single threaded
        Singleton.getInstance();
        Singleton.getInstance();
        Singleton.getInstance();
        System.out.println();

        // Singleton multithreaded with lazy-initiation (on-demand) without possibility to handle of exception
        com.javarush.test.patterns.singleton.ondemand.Singleton.getInstance();
        com.javarush.test.patterns.singleton.ondemand.Singleton.getInstance();
        com.javarush.test.patterns.singleton.ondemand.Singleton.getInstance();
        System.out.println();

        //Synchronized Singleton (multithreaded version) with possibility of exception handling
        com.javarush.test.patterns.singleton.sinchronised.Singleton first =
                com.javarush.test.patterns.singleton.sinchronised.Singleton.getInstance();
        com.javarush.test.patterns.singleton.sinchronised.Singleton second =
                com.javarush.test.patterns.singleton.sinchronised.Singleton.getInstance();
        com.javarush.test.patterns.singleton.sinchronised.Singleton third =
                com.javarush.test.patterns.singleton.sinchronised.Singleton.getInstance();
    }

}
