package com.javarush.test.patterns.singleton.simple;

/**
 * Created by prulov on 12.11.2016.
 */
public class Singleton
{
    private static Singleton instance;
    private int count = 0;

    private Singleton()
    {
        count++;
        System.out.println(this.toString());
    }

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        //System.out.println(instance.toString());
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
