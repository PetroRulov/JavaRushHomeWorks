package com.javarush.test.samples.listarrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by prulov on 12.09.2016.
 */
public class SetALElement
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Petro Rulov");
        list.add("Dmitry Boyko");
        list.add("Andrey Dyadin");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Petro Rulov");
        linkedList.add("Dmitry Boyko");
        linkedList.add("Andrey Dyadin");

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).contains("Dyadin")){
                list.set(i, "Oleksandr Palko");
            }else if(list.get(i).contains("Rulov")){
                list.set(i, list.get(i) + " this is " + list.get(i));
            }
        }

        for(int i = 0; i < linkedList.size(); i++){
            if(linkedList.get(i).contains("Dyadin")){
                linkedList.set(i, "Oleksandr Palko");
            }else if(linkedList.get(i).contains("Rulov")){
                linkedList.set(i, linkedList.get(i) + " this is " + linkedList.get(i));
            }
        }

        for(String string : list) System.out.println(string);
        System.out.println();
        for(String string : linkedList) System.out.println(string);
    }
}
