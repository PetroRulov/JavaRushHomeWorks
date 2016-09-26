package com.javarush.test.samples.exceptions;

/**
 * Created by prulov on 26.09.2016.
 */
public class ExceptionExample01
{
    public static void main(String[] args)
    {
        int value = f();
        System.out.println(value);
    }

    private static int f()
    {
        if(System.currentTimeMillis() % 2 == 0){
            return 0;
        }else{
            throw new MyRuntimeException("Odd quantity of seconds");
        }
    }
}
