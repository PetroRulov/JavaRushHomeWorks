package com.javarush.test.samples.polymorphismus.costructorswork.livecreatures;

import com.javarush.test.samples.polymorphismus.costructorswork.Characteristic;
import com.javarush.test.samples.polymorphismus.costructorswork.Description;

/**
 * Created by prulov on 25.10.2016.
 */
public class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not Vegetable");

    public Animal() {
        System.out.println("Animal()");
    }

    protected void dispose() {
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
