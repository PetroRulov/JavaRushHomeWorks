package com.javarush.test.samples.iverson;

/**
 * Created by prulov on 26.10.2016.
 */
public class BubbleMethod
{
    public static void main(String[] args)
    {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
        System.out.println("Minimal element = " + minBubble(data));
        System.out.println("Index of minimal element = " + minIndexBubble(data));
    }

    public static int minBubble(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int minIndexBubble(int[] array){
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min){
                minIndex = i - 1;
            }
        }
        return minIndex;
    }
}
