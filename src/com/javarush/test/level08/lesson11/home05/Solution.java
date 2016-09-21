package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] charArray = s.toCharArray();

        List<String> charList = new ArrayList<>();

        for(Character character : charArray) charList.add(character.toString());
        for(int i = 0; i < charList.size(); i++){
            charList.add(0, charList.get(0).toUpperCase());
            charList.remove(1);
            if(charList.get(i).equals(" ")){
                charList.add(i + 1, charList.get(i + 1).toUpperCase());
                charList.remove(i + 2);
            }
        }
        for(String string : charList) System.out.print(string);
    }

}
