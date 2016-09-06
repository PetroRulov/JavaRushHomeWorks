package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<Integer> allNumbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<20; i++) allNumbers.add(Integer.parseInt(reader.readLine()));
        List<Integer> threes = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        List<Integer> others = new ArrayList<>();

        for(Integer x : allNumbers){
            if(x % 3 == 0){
                threes.add(x);
                if(x % 2 == 0){
                    evens.add(x);
                }
            }else if(x % 2 == 0){
                evens.add(x);
            }else{
                others.add(x);
            }
        }

        printList(threes);
        printList(evens);
        printList(others);

    }

    public static void printList(List<Integer> list)
    {
        for (Integer x : list)
            System.out.println(x);
    }
}