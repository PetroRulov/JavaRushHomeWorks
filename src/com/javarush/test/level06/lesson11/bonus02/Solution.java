package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPaName = reader.readLine();
        String grandMaName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat catGrandPa = new Cat(grandPaName);
        Cat catGrandMa = new Cat(grandMaName);
        Cat catFather = new Cat(fatherName, catGrandPa);
        Cat catMother = new Cat(motherName, null, catGrandMa);
        Cat catSon = new Cat(sonName, catFather, catMother);
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandPa);
        System.out.println(catGrandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat father)
        {
            this.name = name;
            this.father = father;
        }

        Cat(String name, Cat father, Cat mother)
        {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Cat name is %s", name));
            if (mother == null){
                sb.append(", no mother");
            }else{
                sb.append(", mother is " + mother.name);
            }
            if (father == null){
                sb.append(", no father");
            }else{
                sb.append(", father is " + father.name);
            }
            return sb.toString();
        }
    }
}
