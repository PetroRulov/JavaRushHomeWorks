package com.javarush.test.level14.lesson08.home01;

/**
 * Created by prulov on 07.11.2016.
 */
public class WaterBridge implements Bridge
{
    private int quantity;

    public WaterBridge(){
        quantity = 100;
    }

    @Override
    public int getCarsCount()
    {
        return 100;
    }
}
