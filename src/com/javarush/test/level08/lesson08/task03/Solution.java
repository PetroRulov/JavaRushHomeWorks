package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> mapName = new HashMap<>();
        mapName.put("Rulov", "Petro");
        mapName.put("Rulyov", "Stanislav");
        mapName.put("Borkeyev", "Sergiy");
        mapName.put("Borkeyov", "Vladislav");
        mapName.put("Boiko", "Dmitry");
        mapName.put("Palko", "Oleksandr");
        mapName.put("Dyadin", "Andriy");
        mapName.put("Natyokin", "Sergiy");
        mapName.put("Timchenko", "Andriy");
        mapName.put("Nikishayev", "Sergiy");
        return mapName;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int result = 0;
        for(Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getValue();
            if(name.equals(value)){
                result++;
            }
        }
        return result;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int result = 0;
        for(Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            if(lastName.equals(key)){
                result++;
            }
        }
        return result;
    }
}
