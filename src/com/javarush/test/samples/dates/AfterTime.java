package com.javarush.test.samples.dates;

import java.util.Date;

/**
 * Created by prulov on 12.09.2016.
 */
public class AfterTime
{
    public static void main(String[] args) throws Exception
    {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;
        Date endDate = new Date(endTime);

        Thread.sleep(5001);

        Date currentTime = new Date();
        if (currentTime.after(endDate))
        {
            System.out.println("End time!");
        }
    }
}
