package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) {
//        //add your code here
//        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
//            String string = reader.readLine();
//            int questionSignIndex = string.indexOf("?");
//            String url = string.substring(questionSignIndex + 1);
//            String parameter = null, value = null;
//            List<String> objValuesList = new ArrayList<>();
//
//            for (String snippet : url.split("(\\&+)|(\\?+)")) {
//                if (snippet.split("=").length > 0) {
//                    parameter = snippet.split("=")[0];
//                    System.out.print(parameter + " ");
//                }
//                if ("obj".equals(parameter) && snippet.split("=").length > 1 ) {
//                    value = snippet.split("=")[1];
//                    objValuesList.add(value);
//                }
//            }
//            System.out.print("\n");
//            for (String str : objValuesList)
//            {
//                try
//                {
//                    double num = Double.parseDouble(str);
//                    alert(num);
//                }
//                catch (Exception e)
//                {
//                    alert(str);
//                }
//            }
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//
//    public static void alert(double value) {
//        System.out.println("double " + value);
//    }
//
//    public static void alert(String value) {
//        System.out.println("String " + value);
//    }


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String afterQuestionMark = url.substring(url.indexOf("?")+1);
        String tokens[] = afterQuestionMark.split("(\\&+)|(\\?+)");
        ArrayList<String> objValuesList = new ArrayList<>();
        Pattern objMatch = Pattern.compile("^obj=.*");
        for (String snippet : tokens) {
            if (!"".equals(snippet)) {
                Matcher matcher = objMatch.matcher(snippet);
                if (matcher.find()) {
                    objValuesList.add(snippet.substring(snippet.indexOf("=")+1));
                }
                if (snippet.contains("=")) {
                    System.out.print(snippet.substring(0,(snippet.indexOf("="))) + " ");
                }
                else {
                    System.out.print(snippet + " ");
                }
            }
        }
        Pattern doublePattern = Pattern.compile("[0-9.]");
        Pattern stringPattern = Pattern.compile("[A-Za-z]");
        System.out.println();
        for(String objectValue : objValuesList){
            Matcher matcher = stringPattern.matcher(objectValue);
            Matcher matcher1 = doublePattern.matcher(objectValue);
            if (matcher.find()) {
                alert(objectValue);
            } else if (matcher1.find()) {
                alert(Double.parseDouble(objectValue));
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }

}