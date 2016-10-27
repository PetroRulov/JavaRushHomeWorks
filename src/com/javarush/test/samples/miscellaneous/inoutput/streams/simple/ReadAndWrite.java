package com.javarush.test.samples.miscellaneous.inoutput.streams.simple;

import java.io.*;

/**
 * Created by prulov on 27.10.2016.
 */
public class ReadAndWrite
{
    public static void main(String[] args) throws IOException
    {
        InputStream inStream = new FileInputStream("D:\\TEST\\source.txt");
        OutputStream outStream = new FileOutputStream("D:\\TEST\\result.txt");

        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один байт из потока для чтения
            outStream.write(data); //записываем прочитанный байт в другой поток.
        }

        inStream.close(); //закрываем потоки
        outStream.close();
    }
}
