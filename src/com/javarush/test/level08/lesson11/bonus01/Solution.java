package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        List<String> year = new ArrayList<>();
        year.add("January");
        year.add("February");
        year.add("March");
        year.add("April");
        year.add("May");
        year.add("June");
        year.add("July");
        year.add("August");
        year.add("September");
        year.add("October");
        year.add("November");
        year.add("December");

        for(int i = 0; i < year.size(); i++){
            if(year.get(i).equals(month)){
                System.out.println(month + " is " + (i + 1) + " month");
            }
        }
    }

}
