package com.javarush.test.samples.polymorphismus.costructorswork;

/**
 * Created by prulov on 25.10.2016.
 */
public class Description
{
    private String s;

    public Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }

    public void dispose() {
        System.out.println("disposing Description " + s);
    }
}