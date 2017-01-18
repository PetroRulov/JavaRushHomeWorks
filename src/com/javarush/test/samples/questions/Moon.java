package com.javarush.test.samples.questions;

/**
 * Created by prulov on 27.12.2016.
 */
public class Moon implements Planet
{
    private Moon()
    {
        System.out.println("Moon joining us at the moment.");
    }

    private static class MoonHolder
    {
        private static final Moon instance = new Moon();
    }

    public static Moon getInstance()
    {
        return MoonHolder.instance;
    }

    @Override
    public String toString()
    {
        return "Moon{}" ;
    }
}
