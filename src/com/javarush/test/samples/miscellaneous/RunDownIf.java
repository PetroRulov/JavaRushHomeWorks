package com.javarush.test.samples.miscellaneous;

/**
 * Created by prulov on 13.10.2016.
 */
public class RunDownIf
{
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o)
    {
        String str = "";
        if(o instanceof Cow){
            str = "Корова";
        }else if(o instanceof Dog){
            str = "Собака";
        }else{
            str = o instanceof Whale ? "Кит" : "Неизвестное животное";
        }
        return str;
    }

    public static class Cow
    {
    }

    public static class Dog
    {
    }

    public static class Whale
    {
    }

    public static class Pig
    {
    }
}
