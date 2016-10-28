package com.javarush.test.patterns.ifabrics;

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        // Реализации полностью взаимозаменяемы:
        serviceConsumer(new Implementation2Factory());
    }
}

