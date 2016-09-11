package com.javarush.test.samples.iteratorusing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by prulov on 07.09.2016.
 */
public class RemoveWIthIterator
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Soroka");
        list.add("-");
        list.add("");
        list.add("vorovka ");
        list.add("");
        list.add("kashu ");
        list.add("");
        list.add("varila");
        list.add(", ");
        list.add("detok ");
        list.add("");
        list.add("kormila.");

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String string = iterator.next();
            if (string.isEmpty()) {
                // Remove the current element from the iterator and the from the list.
                iterator.remove();
            }
        }

        for(String str : list) System.out.print(str);
        System.out.println();


        //INTERESTING METHOD collection1.removeAll(collection2)

        Collection<Integer> listInt = new ArrayList<Integer>();
        Collection<Integer> itemsToRemove = new ArrayList<Integer>();
        for (int i=0; i < 10; ++i) {
            listInt.add(new Integer(4));
            listInt.add(new Integer(5));
            listInt.add(new Integer(6));
        }
        for (Integer i : listInt)
        {
            if (i.intValue() == 5)
                itemsToRemove.add(i);
        }

        listInt.removeAll(itemsToRemove);

        System.out.println(listInt);
    }
}
