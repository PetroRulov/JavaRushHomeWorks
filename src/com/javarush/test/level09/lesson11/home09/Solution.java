package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> cats = new HashMap<>();
        cats.put("Barsik", new Cat("Barsik"));
        cats.put("Grey", new Cat("Grey"));
        cats.put("Murka", new Cat("Murka"));
        cats.put("Barsik1", new Cat("Barsik1"));
        cats.put("Barsik2", new Cat("Barsik2"));
        cats.put("Barsik3", new Cat("Barsik3"));
        cats.put("Barsik4", new Cat("Barsik4"));
        cats.put("Vaska", new Cat("Vaska"));
        cats.put("Vaska1", new Cat("Vaska1"));
        cats.put("Vaska2", new Cat("Vaska2"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> cats = new HashSet<>();
        for(Map.Entry<String, Cat> pair : map.entrySet()){
            cats.add(pair.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
