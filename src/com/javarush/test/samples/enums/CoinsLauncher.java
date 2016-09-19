package com.javarush.test.samples.enums;

/**
 * Created by prulov on 19.09.2016.
 */
public class CoinsLauncher{

    public static void main(String[] args){

        for (Coins coin : Coins.values()) System.out.println("Coin: " + coin);
        System.out.println();

        System.out.println("Coins in ONE = " + Coins.ONE.getValue() + " kopiyok");
        System.out.println();

        System.out.println("Coins in ONE orderNumber # " + Coins.ONE.ordinal());
        System.out.println();

        System.out.println("If 0 the objects are equal ? - " + Coins.DIME.compareTo(Coins.DIME));
        System.out.println("If sign+ the object compared is before (not equal) ? " + Coins.DIME.compareTo(Coins.TWOPENNY));
        System.out.println("If sign- the object compared is after ? " + Coins.DIME.compareTo(Coins.FIFTY));

    }
}
