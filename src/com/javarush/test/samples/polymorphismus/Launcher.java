package com.javarush.test.samples.polymorphismus;

import com.javarush.test.samples.polymorphismus.costructorswork.livecreatures.Frog;

/**
 * Created by prulov on 25.10.2016.
 */
public class Launcher
{
    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Bye!");
        frog.dispose();
    }
}
