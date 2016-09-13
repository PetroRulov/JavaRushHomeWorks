package com.javarush.test.level08.lesson08.task05;

import java.util.*;

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
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        List<String> duplicates = new ArrayList<>();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            if(getCountTheSameFirstName(map, pair.getValue()) > 1){
                iterator.remove();
                duplicates.add(pair.getValue());
            }
        }
        for(String name : duplicates){
            removeItemFromMapByValue(map, name);
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

//    public static void main(String[] args)
//    {
//        HashMap<String, String> map = createMap();
//        removeTheFirstNameDuplicates(map);
//        for(Map.Entry<String, String> pair: map.entrySet()) System.out.println(pair.getValue());
//    }
}
