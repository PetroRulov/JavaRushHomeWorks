package com.javarush.test.level12.lesson12.bonus03;

/* Задача по алгоритмам
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array)
    {
        if (array == null || array.length == 0)
        {
            return new Pair<Integer, Integer>(null, null);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(i, array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
        Integer index = 0;
        while (iter.hasNext())
        {
            Map.Entry<Integer, Integer> pair = iter.next();
            Integer key = pair.getKey();            //ключ
            Integer value = pair.getValue();        //значение
            if(value == array[0]){
                index = key;
                break;
            }
        }
        return new Pair<Integer, Integer>(array[0], index);
    }


    public static class Pair<X, Y>
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
