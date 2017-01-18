package com.javarush.test.samples.questions;

/**
 * Created by prulov on 27.12.2016.
 */
public class Sun implements Planet
{
    private Sun()
    {
        System.out.println("!!! SUN was created right now!!!");
    }

    private static class SunHolder
    {
        private static final Sun instance = new Sun();
    }

    public static Sun getInstance()
    {
        return SunHolder.instance;
    }

    @Override
    public String toString()
    {
        return "Sun{}" ;
    }
}
