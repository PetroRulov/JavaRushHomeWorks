package com.javarush.test.patterns.singleton.sinchronised;

public class Singleton
{
    private static Singleton instance;
    private int count = 0;

    private Singleton()
    {
        count++;
        System.out.println(this.toString());
    }

    public static synchronized Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return  instance;
    }

    @Override
    public String toString()
    {
        return "Singleton{" +
                "count=" + count +
                '}';
    }
}