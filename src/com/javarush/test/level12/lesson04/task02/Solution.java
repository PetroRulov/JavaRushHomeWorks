package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Integer n = Integer.valueOf(5);
        int nInt = n;
        print(n);
        print(nInt);

    }

    public static void print(int a){
        System.out.println(a);
    }

    public static void print(Integer m){
        System.out.println("print(Integer m)");
    }
}
