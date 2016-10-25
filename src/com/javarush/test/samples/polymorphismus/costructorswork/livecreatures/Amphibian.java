package com.javarush.test.samples.polymorphismus.costructorswork.livecreatures;

import com.javarush.test.samples.polymorphismus.costructorswork.Characteristic;
import com.javarush.test.samples.polymorphismus.costructorswork.Description;

/**
 * Created by prulov on 25.10.2016.
 */
public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");

    public Amphibian() {
        System.out.println("Amphibian()");
    }

    protected void dispose() {
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
