package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int n = 20;
        int num[] = new int[n];
        int a[] = new int[n/2];
        int b[] = new int[n/2];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<n; i++){
            num[i]=Integer.parseInt(reader.readLine());
        }
        for(int i = 0, j = n/2; i < n/2; i++, j++){
            a[i] = num[i];
            b[i] = num[j];
        }
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }


    }
}
