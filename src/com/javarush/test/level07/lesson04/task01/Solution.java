package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {

        int data[] = new int[20];
        try(BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in))){
            for(int i=0; i<data.length; i++){
                data[i]=Integer.parseInt(reader.readLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return data;
    }

    public static int max(int[] array) {

        int temp;
        for (int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        return array[array.length - 1];
    }
}
