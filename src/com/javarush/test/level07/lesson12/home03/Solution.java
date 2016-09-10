package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        int numbers[] = new int[20];
        for(int i=0; i<20; i++) numbers[i]=Integer.parseInt(reader.readLine());
        int data[] = numbers;
        for (int i = data.length - 1; i >= 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) {
                break;
            }
        }
        maximum = data[data.length-1];
        minimum = data[0];

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
