package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
//        String fileName = "";
//        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
//            fileName = reader.readLine();
//            fileName = "D:\\TEST\\" + fileName + ".txt";
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        StringBuilder builder = new StringBuilder();
//        try(FileInputStream fis = new FileInputStream(fileName)){
//            int i;
//            while((i = fis.read()) != -1){
//                builder.append((char) i);
//            }
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//        System.out.println(builder.toString());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fn = reader.readLine();
        InputStream text = new FileInputStream(fn);
        while (text.available() > 0)
        {
            System.out.print((char) text.read());
        }
        reader.close();
        text.close();
    }
}
