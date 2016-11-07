package com.javarush.test.level14.lesson06.home01;

public abstract class Hen{

    protected int count;
    protected String country;

    abstract int getCountOfEggsPerMonth();

    String getDescription(){return "Я курица.";}
}