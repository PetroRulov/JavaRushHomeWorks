package com.javarush.test.level10.lesson11.home08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Mama");
        list1.add("myla");
        list1.add("ramu");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Rama");
        list2.add("myla");
        list2.add("no");
        list2.add("ne");
        list2.add("Mamu");

        ArrayList<String>[] listArr = new ArrayList[2];
        listArr[0] = list1;
        listArr[1] = list2;

        return listArr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}