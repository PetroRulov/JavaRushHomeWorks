package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int numbers[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++){
            if(scan.hasNextInt())
            numbers[i] = scan.nextInt();
        }
        int aux[] = new int[numbers.length];
        for (int j = numbers.length - 1; j >= 0; j--){
            aux[j] = numbers[numbers.length - 1 - j];
        }
        numbers = aux;
        for (int i = 0; i < aux.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
