package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        Human grandChild1 = new Human("Petro", true, 39, new ArrayList<Human>());
        Human grandChild2 = new Human("Oleg", true, 34, new ArrayList<Human>());
        Human grandChild3 = new Human("Darya", false, 23, new ArrayList<Human>());
        List<Human> children = new ArrayList<>();
        children.add(grandChild1);
        children.add(grandChild2);
        children.add(grandChild3);
        Human pa = new Human("Volodymir", true, 61, children);
        Human ma = new Human("Tetyana", false, 61, children);
        List<Human> pas = new ArrayList<>();
        pas.add(pa);
        List<Human> mas = new ArrayList<>();
        mas.add(ma);
        Human grandPaPa = new Human("Petro", true, 96, pas);
        Human grandPaMa = new Human("Vasyliy", true, 101, mas);
        Human grandMaPa = new Human("Matryona", false, 91, pas);
        Human grandMaMa = new Human("Lidiya", false, 96, mas);

        List<Human> fam = new ArrayList<>();
        fam.add(grandPaPa);
        fam.add(grandPaMa);
        fam.add(grandMaPa);
        fam.add(grandMaMa);
        fam.add(pa);
        fam.add(ma);
        fam.add(grandChild1);
        fam.add(grandChild2);
        fam.add(grandChild3);
        for(Human human : fam) System.out.println(human);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private List<Human> children;

        public Human(String name, boolean sex, int age, List<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>(children);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            return text;
        }
    }

}
