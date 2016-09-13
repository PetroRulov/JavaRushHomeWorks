package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashSet<String> copy = new HashSet<String>();
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            String value = pair.getValue();
            copy.add(value);
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
