package com.javarush.test.samples.stacks;

public class ExceptionExample
{
    public static void main(String[] args)
    {
        method1();
        //System.out.println(getMessage());
    }

    public static void method1()
    {
        method2();
    }

    public static void method2()
    {
        method3();
    }

    public static void method3()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }

        System.out.println(getMessage());
    }

    public static String getMessage(){

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String message = "";
        if(stackTraceElements.length >= 3) {
            StackTraceElement element = stackTraceElements[2];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            int codeLine = element.getLineNumber();
            message = "Class: " + className + ", method: " + methodName + ", number of line: " + codeLine;
        }
        return message;
    }


}
