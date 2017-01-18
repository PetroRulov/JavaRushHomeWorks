package com.javarush.test.samples.questions;

/**
 * Created by prulov on 27.12.2016.
 */
public class Earth implements Planet
{
    private Earth()
    {
        System.out.println("!!!You just create an Earth!!!");
    }

    private static class EarthHolder
    {
        private static final Earth instance = new Earth();
    }

    public static Earth getInstance()
    {
        return EarthHolder.instance;
    }

    @Override
    public String toString()
    {
        return "Earth{}" ;
    }
}
