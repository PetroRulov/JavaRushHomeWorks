package com.javarush.test.level10.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by prulov on 15.11.2016.
 */
public class IntInByte
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        System.out.println("(byte) = " + (byte)a);
        System.out.println();
        System.out.println("PRmethod = " + transferIntIntoByte(a));
    }

    public static int transferIntIntoByte(int a){

        if(a >= 256) a = a % 256;
        if(a <= 127)
        {
            return a;
        }
        return a % 128 - 128;
    }
}
