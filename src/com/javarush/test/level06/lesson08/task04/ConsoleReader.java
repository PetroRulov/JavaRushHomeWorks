package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        String str = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            str = reader.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        return str;
    }

    public static int readInt() throws Exception
    {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt())
            number = scan.nextInt();
        return number;
    }

    public static double readDouble() throws Exception
    {
        double d = 0.0;
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextDouble())
            d = scan.nextDouble();
        return d;
    }

    public static boolean readBoolean() throws Exception
    {
        boolean bul = false;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            if(reader.readLine().equals("true"))
                bul = true;
        }catch(IOException e){
            e.printStackTrace();
        }
        return bul;
    }
}
