package com.javarush.test.samples.polymorphismus.costructorswork.livecreatures;

import com.javarush.test.samples.polymorphismus.costructorswork.Characteristic;
import com.javarush.test.samples.polymorphismus.costructorswork.Description;

/**
 * Created by prulov on 25.10.2016.
 */
public class Frog extends Amphibian {

    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");

    public Frog() {
        System.out.println("Frog()");
    }

    public void dispose() {
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
