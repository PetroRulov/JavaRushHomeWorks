package com.javarush.test.samples.polymorphismus.costructorswork;

/**
 * Created by prulov on 25.10.2016.
 */
public class Characteristic
{
    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }

    public void dispose() {
        System.out.println("disposing Characteristic " + s);
    }
}