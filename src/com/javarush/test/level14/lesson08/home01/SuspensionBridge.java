package com.javarush.test.level14.lesson08.home01;

/**
 * Created by prulov on 07.11.2016.
 */
public class SuspensionBridge implements Bridge
{
    private int quantity;

    public SuspensionBridge()
    {
        quantity = 200;
    }

    @Override
    public int getCarsCount()
    {
        return 200;
    }
}
