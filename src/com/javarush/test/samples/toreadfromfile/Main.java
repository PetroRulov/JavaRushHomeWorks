package com.javarush.test.samples.toreadfromfile;

/**
 * Created by prulov on 28.12.2016.
 */
public class Main
{

    public static void main(String[] args)
    {
        String filePath = "D:\\TEXT_FILES\\Alphabet.txt";
        ToReadTextFromFile reader = new ToReadTextFromFile(filePath);
        // for whole the text
        System.out.println(reader.readWholeTextFromFile());
        System.out.println();
        // for each line of the text separately
        for (String line : reader.readTextLineByLine())
        {
            System.out.println(line);
        }
    }
}
