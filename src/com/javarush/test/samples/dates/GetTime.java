package com.javarush.test.samples.dates;

import java.util.Date;

/**
 * Created by prulov on 12.09.2016.
 */
public class GetTime
{
    public static void main(String[] args)
    {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
    }
}
