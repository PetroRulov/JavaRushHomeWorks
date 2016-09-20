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

    @Override
    public String toString(){
        switch (this){
            case PENNY:
                System.out.println("Penny: " + value);
                break;
            case TWOPENNY:
                System.out.println("Twopenny: " + value);
                break;
            case NICKLE:
                System.out.println("Nickle: " + value);
                break;
            case DIME:
                System.out.println("Dime: " + value);
                break;
            case QUARTER:
                System.out.println("Quarter: " + value);
                break;
            case FIFTY:
                System.out.println("FIFTY: " + value);
                break;
            default:
                System.out.println("Quarter: " + value);
        }
        return super.toString();
    }
}
