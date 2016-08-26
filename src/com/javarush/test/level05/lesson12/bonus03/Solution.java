package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try(
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ){
            int maximum = 0;
            int n = Math.abs(Integer.parseInt(reader.readLine()));
            int data[] = new int[n];
            int sum = 0;
            if(n>0){
                for(int i=0; i<n; i++){
                    data[i]=Integer.parseInt(reader.readLine());
                }
                for(int j=0; j<data.length-1; j++){
                    int temp;
                    if(data[j]>data[j+1]){
                        temp=data[j];
                        data[j]=data[j+1];
                        data[j+1]=temp;
                    }
                }
                maximum=data[data.length-1];
            }
            System.out.println(maximum);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
