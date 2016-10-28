package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        //fileName = "D:\\TEST\\" + fileName + ".txt";

        boolean flag = true;
        List<String> list = new ArrayList<>();
        while(flag){
            String str = reader.readLine();
            list.add(str);
            if(str.equals("exit")){
                flag = false;
            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        for (String s : list)
        {
            writer.write(s);
            if(!s.equals("exit")) writer.newLine();
        }
        writer.close();
    }
}
