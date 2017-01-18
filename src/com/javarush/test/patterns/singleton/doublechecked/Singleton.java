package com.javarush.test.patterns.singleton.doublechecked;

public class Singleton
{
    private static volatile Singleton _instance;

    // This is a classic example of double checked locking in Singleton
    //Read more: http://javarevisited.blogspot.com/2011/04/synchronization-in-java-synchronized.html#ixzz4QvruMXI9
    public static Singleton getInstance(){
        if(_instance == null){
            synchronized (Singleton.class){
                if(_instance == null){
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }
}
