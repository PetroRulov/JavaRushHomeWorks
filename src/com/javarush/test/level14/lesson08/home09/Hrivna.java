package com.javarush.test.level14.lesson08.home09;

/**
 * Created by prulov on 08.11.2016.
 */
public class Hrivna extends Money
{

    public Hrivna(double amount)
    {
        super(amount);
    }

    @Override
    public double getAmount()
    {
        return amount;
    }

    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }
}
