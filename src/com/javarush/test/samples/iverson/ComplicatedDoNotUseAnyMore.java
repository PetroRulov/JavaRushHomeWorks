package com.javarush.test.samples.iverson;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by prulov on 07.10.2016.
 */
public class ComplicatedDoNotUseAnyMore
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int array[] = new int[5];
        for(int i=0; i<5; i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
        for (int i = array.length - 1; i >= 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) {
                break;
            }
        }
        for(int number : array){
            System.out.println(number);
        }
    }
}
