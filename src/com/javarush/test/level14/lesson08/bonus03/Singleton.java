package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by prulov on 12.11.2016.
 */
public final class Singleton
{
    private static Singleton instanse;
    private int count = 0;

    private Singleton()
    {
        System.out.println("Singleton's count = " + count++);
    }

    public static Singleton getInstance()
    {
        if(instanse == null)
        {
            instanse = new Singleton();
        }
        return instanse;
    }
}
