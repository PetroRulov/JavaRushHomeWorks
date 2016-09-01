package com.javarush.test.level06.lesson08.task05;

/**
 * Created by prulov on 30.08.2016.
 */
public class SHLauncher
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(new StringHelper().multiply("Амиго", 10));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
