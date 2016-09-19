package com.javarush.test.samples.enums;

/**
 * Created by prulov on 19.09.2016.
 */
public enum Coins{

    PENNY(1), TWOPENNY(2), NICKLE(5), DIME(10), QUARTER(25), FIFTY(50), ONE(100);
    private int value;

    private Coins(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
