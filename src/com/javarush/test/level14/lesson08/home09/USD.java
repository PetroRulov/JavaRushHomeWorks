package com.javarush.test.level14.lesson08.home09;

/**
 * Created by prulov on 08.11.2016.
 */
public class USD extends Money
{

    public USD(double amount)
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
        return "USD";
    }
}