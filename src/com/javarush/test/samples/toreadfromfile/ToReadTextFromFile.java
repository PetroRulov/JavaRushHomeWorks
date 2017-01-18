package com.javarush.test.samples.toreadfromfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by prulov on 28.12.2016.
 */
public class ToReadTextFromFile
{
    private String filePath;

    public ToReadTextFromFile(String filePath)
    {
        this.filePath = filePath;
    }

    public String getFilePath()
    {
        return filePath;
    }

    public String readWholeTextFromFile()
    {
        StringBuilder textBuilder = new StringBuilder();
        try (
                FileInputStream fis = new FileInputStream(this.getFilePath());
                BufferedInputStream bis = new BufferedInputStream(fis);
        ) {
            int i;
            while((i = bis.read()) != -1){
                textBuilder.append((char) i);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return textBuilder.toString();
    }

    public List<String> readTextLineByLine()
    {
        List<String> lines = new ArrayList<>();
        try
        {
            BufferedReader in = new BufferedReader(new FileReader(this.getFilePath()));
            try {
                String line;
                while ((line = in.readLine()) != null) {
                    lines.add(line);
                }
            }
            finally
            {
                in.close();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
