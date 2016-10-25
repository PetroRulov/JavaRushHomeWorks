package com.javarush.test.samples.polymorphismus.covariant5;

/**
 * Created by prulov on 25.10.2016.
 */
public class CovariantReturn {

    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println("This Grain g is " + g);
        m = new WheatMill(); // Mill m become WheatMill
        g = m.process(); // m.process() will return Wheat! NOT Grain
        System.out.println("This Grain g is " + g);
    }

    static class Grain {
        public String toString() { return "Grain"; }
    }

    static class Wheat extends Grain {
        public String toString() { return "Wheat"; }
    }

    static class Mill {
        Grain process() { return new Grain(); }
    }

    static class WheatMill extends Mill {
        Wheat process() { return new Wheat(); }
    }
}