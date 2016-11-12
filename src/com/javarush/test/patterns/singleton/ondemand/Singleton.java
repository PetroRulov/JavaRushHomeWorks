package com.javarush.test.patterns.singleton.ondemand;

/**
 * Created by prulov on 12.11.2016.
 */
public class Singleton
{
    private int count = 0;

    private Singleton(){
        count++;
        System.out.println(this.toString());
    }

    private static class SingletonHolder
    {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance()
    {
        return SingletonHolder.instance;
    }

    @Override
    public String toString()
    {
        return "Singleton{}" + count;
    }
}
