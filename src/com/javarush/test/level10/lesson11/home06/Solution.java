package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String name;
        private String surName;
        private Date dateOfBirth;
        private String sex;
        private Human father;
        private Human mother;

        public Human(){}

        public Human(String name, String surName){
            this.name = name;
            this.surName = surName;
        }

        public Human(String name, String surName, Date dateOfBirth, String sex){
            this.name = name;
            this.surName = surName;
            this.dateOfBirth = dateOfBirth;
            this.sex = sex;
        }

        public Human(String name, String surName, Date dateOfBirth, String sex, Human father, Human mother){
            this.name = name;
            this.surName = surName;
            this.dateOfBirth = dateOfBirth;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public Human(Date dateOfBirth, String sex){
            this.dateOfBirth = dateOfBirth;
            this.sex = sex;
        }

        public Human(String sex){
            this.sex = sex;
        }

        public Human(Human father, Human mother)
        {
            this.father = father;
            this.mother = mother;
        }

        public Human(Date dateOfBirth, Human father, Human mother)
        {
            this.dateOfBirth = dateOfBirth;
            this.father = father;
            this.mother = mother;
        }

        public Human(String surName, Human father)
        {
            this.surName = surName;
            this.father = father;
        }

        public Human(String surName, Date dateOfBirth, String sex)
        {
            this.surName = surName;
            this.dateOfBirth = dateOfBirth;
            this.sex = sex;
        }
    }
}
