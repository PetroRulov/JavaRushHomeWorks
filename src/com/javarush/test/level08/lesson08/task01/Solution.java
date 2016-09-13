package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> lSet = new HashSet<>();

        lSet.add("любовь");
        lSet.add("лама");
        lSet.add("лекало");
        lSet.add("лекарство");
        lSet.add("лекарь");
        lSet.add("луна");
        lSet.add("лепесток");
        lSet.add("лодыжка");
        lSet.add("лоно");
        lSet.add("люстра");
        lSet.add("лира");
        lSet.add("лопаст");
        lSet.add("ляпсус");
        lSet.add("ляпус");
        lSet.add("лён");
        lSet.add("лепрозорий");
        lSet.add("лоток");
        lSet.add("лабель");
        lSet.add("лажа");
        lSet.add("лымарь");

        return lSet;
    }
}
