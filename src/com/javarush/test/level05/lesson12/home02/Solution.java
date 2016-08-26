package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man boy = new Man("Roma", 16, "blablabla");
        Man oldMan = new Man("Roman", 76, "blablabla");
        Woman girl = new Woman("Dina", 15, "blablabla");
        Woman oldWoman = new Woman("Sara", 66, "blablabla");

        System.out.println(boy.toString());
        System.out.println(oldMan.toString());
        System.out.println(girl.toString());
        System.out.println(oldWoman.toString());
    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return name+" "+age+" "+address;
        }
    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return name+" "+age+" "+address;
        }
    }
}
