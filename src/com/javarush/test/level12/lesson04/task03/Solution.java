package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public String print(long id){
        return "id = " + id;
    }

    public void print(){}

    public int print(byte a){
        return (int) a;
    }

    public void print (String str){
        System.out.println(str);
    }

    public int print(int a, String str){
        return a - Integer.parseInt(str);
    }
}
