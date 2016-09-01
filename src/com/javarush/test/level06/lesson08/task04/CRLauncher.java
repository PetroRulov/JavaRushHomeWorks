package com.javarush.test.level06.lesson08.task04;

/**
 * Created by prulov on 30.08.2016.
 */
public class CRLauncher
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(new ConsoleReader().readBoolean());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
