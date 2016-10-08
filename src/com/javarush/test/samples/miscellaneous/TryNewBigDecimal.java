package com.javarush.test.samples.miscellaneous;

import java.math.BigDecimal;

/**
 * Created by prulov on 07.10.2016.
 */
public class TryNewBigDecimal
{
    public static void main(String[] args)
    {
        BigDecimal bd = new BigDecimal("1.23");
        System.out.println(bd);
        BigDecimal nbd = BigDecimal.valueOf(1.23);
        System.out.println(nbd);
    }
}
