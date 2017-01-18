package com.javarush.test.samples.constructors.constructfromconstruct;

/**
 * Created by prulov on 30.11.2016.
 */
public class Flower
{
        int petalCount = 0;
        String s = "initial value";

        Flower(int petals) {
            petalCount = petals;
            System.out.println("First invocation: Constructor with int arg only, petalCount= " + petalCount);
        }

        Flower(String ss) {
            System.out.println("Constructor w/ String arg only, s = " + ss);
            s = ss;
        }

        Flower(String s, int petals) {
            this(petals);
            this.s = s;
            System.out.println("Second invocation: Constructor with String & int args");
        }

        Flower() {
            this("hi", 47);
            System.out.println("Default Constructor (no args)");
        }

        void printPetalCount() {
            System.out.println("method printPetalCount: petalCount = " + petalCount + ", s = "+ s);
        }



        public static void main(String[] args) {
            Flower x = new Flower();
            System.out.println();
            x.printPetalCount();
        }
}
