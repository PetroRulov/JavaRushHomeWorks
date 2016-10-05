package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
//        Map<Integer, String> digits = new HashMap<>();
//        Map<Integer, String> words = new HashMap<>();
//
//        for (int i = 0; i < array.length; i++) {
//            if(isNumber(array[i])){
//                digits.put(i, array[i]);
//            }else{
//                words.put(i, array[i]);
//            }
//        }
//
//        List<String> sortedDigits = new ArrayList<>();
//        for(Map.Entry<Integer, String> pair : digits.entrySet()) sortedDigits.add(pair.getValue());
//        String[] arrayDigits = sortedDigits.toArray(new String[sortedDigits.size()]);
//        boolean flag = true;
//        String temp;
//        while(flag){
//            flag=false;
//            for (int j = 0; j < arrayDigits.length - 1; j++) {
//                if( Integer.parseInt(arrayDigits[j]) < Integer.parseInt(arrayDigits[j+1])){
//                    temp = arrayDigits[j];
//                    arrayDigits[j] = arrayDigits[j+1];
//                    arrayDigits[j+1]=temp;
//                    flag=true;
//                }
//            }
//        }
//
//        List<String> sortedWords = new ArrayList<>();
//        for(Map.Entry<Integer, String> pair : words.entrySet()) sortedWords.add(pair.getValue());
//        String[] arrayWords = sortedWords.toArray(new String[sortedDigits.size()]);
//        flag = true;
//        while(flag){
//            flag=false;
//            for (int j = 0; j < words.size() - 1; j++) {
//                if( isGreaterThan(arrayWords[j].toLowerCase(), arrayWords[j+1].toLowerCase())){
//                    temp=arrayWords[j];
//                    arrayWords[j] = arrayWords[j+1];
//                    arrayWords[j+1] = temp;
//                    flag=true;
//                }
//            }
//        }
//
//        digits.clear();
//        words.clear();
//
//        int j = 0, k = 0;
//        for (int i = 0; i < array.length; i++)
//        {
//            if(isNumber(array[i])){
//                digits.put(i, arrayDigits[j]);
//                if(j < arrayDigits.length) j++;
//            }else{
//                words.put(i, arrayWords[k]);
//                if(k < arrayWords.length) k++;
//            }
//        }
//
//        for(Map.Entry<Integer, String> pair : words.entrySet()){
//            digits.put(pair.getKey(), pair.getValue());
//        }
//
//        int i = 0;
//        for(Map.Entry<Integer, String> pair : digits.entrySet()){
//            array[i] = pair.getValue();
//            i++;
//        }

        ArrayList<Integer> stringList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i])) {
                intList.add(i);
            } else {
                stringList.add(i);
            }
        }

        for (int i = (stringList.size() - 1); i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                int num = stringList.get(j);
                int numNext = stringList.get(j + 1);
                if (isGreaterThan(array[num], array[numNext])) {
                    String tmp = array[num];
                    array[num] = array[numNext];
                    array[numNext] = tmp;
                }
            }
        }

        for (int i = (intList.size() - 1); i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                int num = intList.get(j);
                int numNext = intList.get(j + 1);
                if (Integer.parseInt(array[numNext]) > Integer.parseInt(array[num])) {
                    String tmp = array[num];
                    array[num] = array[numNext];
                    array[numNext] = tmp;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
