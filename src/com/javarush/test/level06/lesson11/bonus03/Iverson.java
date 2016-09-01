package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Iverson
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int data[] = new int[5];
        for(int i=0; i<5; i++){
            data[i]=Integer.parseInt(reader.readLine());
        }
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
        for(int number : data){
            System.out.println(number);
        }
    }
}
