package com.javarush.test.samples.polymorphismus.costructorswork.livecreatures;

import com.javarush.test.samples.polymorphismus.costructorswork.Characteristic;
import com.javarush.test.samples.polymorphismus.costructorswork.Description;

/**
 * Created by prulov on 25.10.2016.
 */
public class LivingCreature
{
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");

    public LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose() {
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}
