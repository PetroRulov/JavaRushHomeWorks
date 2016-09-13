package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Gibson", new Date("JANUARY 3 1956"));
        map.put("Kidman", new Date("JUNE 20 1967"));
        map.put("Cassel", new Date("NOVEMBER 23 1966"));
        map.put("Belucci", new Date("SEPTEMBER 9 1964"));
        map.put("Shwarznegger", new Date("JANUARY 5 1951"));
        map.put("Theron", new Date("JULY 11 1980"));
        map.put("Bardem", new Date("NOVEMBER 12 1966"));
        map.put("Law", new Date("JULY 6 1977"));
        map.put("Judd", new Date("JULY 17 1967"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator <Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            String date = iterator.next().getValue().toString();
            if (date.contains("Jun")|| date.contains("Jul")|| date.contains("Aug")) iterator.remove();
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for(Map.Entry<String, Date> pair : map.entrySet()) System.out.println(pair.getKey());
    }
}
