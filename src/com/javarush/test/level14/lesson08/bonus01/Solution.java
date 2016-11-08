package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            Integer.parseInt("g45");
        }catch(NumberFormatException e)
        {
            exceptions.add(e);
        }
        String zero = null;
        try
        {
            zero.substring(2, 3);
        }catch(NullPointerException e)
        {
            exceptions.add(e);
        }
        double d[] = new double[]{3.2};
        try
        {
            for (int i = 0; i < 3; i++)
            {
                double v = d[i];

            }
        }catch(ArrayIndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }
        String s = "";
        try
        {
            s.substring(1);
        }catch(StringIndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }
        ArrayList<String> zer = new ArrayList<String>(){};
        try
        {
            System.out.println(zer.get(1));
        }catch(IndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }

        exceptions.add(someMethod1());
        exceptions.add(someMethod2());
        exceptions.add(someMethod3());
        exceptions.add(someMethod4());



        //Add your code here

    }

    private static Exception someMethod1(){
        return new IllegalArgumentException();
    }

    private static Exception someMethod2(){
        return new IOException();
    }

    private static Exception someMethod3(){
        return new FileNotFoundException();
    }

    private static Exception someMethod4(){
        return new SocketException();
    }
}
