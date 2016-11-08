package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();
        if(isInt(first) && isInt(second))
        {
            int a = Integer.parseInt(first);
            int b = Integer.parseInt(second);
            while (a != 0 && b != 0)
            {
                if (a > b)
                {
                    a = a % b;
                } else
                {
                    b = b % a;
                }
            }
            System.out.println(a+b);
        }else
        {
            System.out.println("Input the numbers correctly, please!");
            return;
        }
    }

    public static boolean isInt(String str){
        try
        {
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException nfe)
        {
            return false;
        }
    }
}
