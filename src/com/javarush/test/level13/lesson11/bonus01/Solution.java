package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String fileName = "oddEven";
        String fileName = reader.readLine();
        fileName = "D:\\TEST\\" + fileName + ".txt";

        //BufferedReader fromFile = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        BufferedReader fromFile = new BufferedReader(new FileReader(fileName));

        boolean flag = true;
        List<Integer> nums = new ArrayList<>();
        String str = null;
        while(flag){
            flag = false;
            str = fromFile.readLine();
            if( str != null){
                nums.add(Integer.parseInt(str));
                flag = true;
            }
        }
        for (Iterator<Integer> iterator = nums.iterator(); iterator.hasNext();)
        {
            Integer num = iterator.next();
            if (num % 2 != 0)
            {
                iterator.remove();
            }
        }
        Collections.sort(nums);
        for (Integer num : nums)
        {
            System.out.println(num);
        }

//        int array[] = new int[nums.size()];
//        for (int i = 0; i < array.length; i++)
//        {
//            array[i] = nums.get(i);
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (array[j] > array[j+1]) {
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }
//
//        for (int i : array)
//        {
//            System.out.println(i);
//        }

    }
}
