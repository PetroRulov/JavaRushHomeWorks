package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        List<Human> family = new ArrayList<>();
        Human dadPa = new Human("Petro", true, 99);
        Human momPa = new Human("Vasyliy", true, 101);
        Human dadMa = new Human("Matrena", false, 95);
        Human momMa = new Human("Lydia", false, 93);
        Human dad = new Human("Vladimir", true, 61, dadPa, dadMa);
        Human mom = new Human("Tatyana", false, 61, momPa, momMa);

        family.add(dadPa);
        family.add(momPa);
        family.add(dadMa);
        family.add(momMa);
        family.add(dad);
        family.add(mom);
        family.add(new Human("Petro", true, 39, dad, mom));
        family.add(new Human("Oleg", true, 34, dad, mom));
        family.add(new Human("Darya", false, 28, dad, mom));

        for(Human human : family)System.out.println(human);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null)
                text += ", отец: " + this.father.name;
            if (this.mother != null)
                text += ", мать: " + this.mother.name;
            return text;
        }
    }

}
