package com.javarush.test.samples.usingiterator;

import java.util.*;

/**
 * Created by prulov on 07.09.2016.
 */
public class RemoveWithIterator
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

        // FOR SET(HashSet)

        HashSet<Integer> intSet = new HashSet<>();
        for(int i=0; i<20; i++) intSet.add(i);

        Iterator<Integer> iterator = intSet.iterator();
        while (iterator.hasNext()){
            if (iterator.next()>10) iterator.remove();
        }

        for(Integer number : intSet) System.out.println(number);
        System.out.println();

        // ITERATOR for HashMap
        Map<String, String> map = new HashMap<>();
        map.put("Rulov", "Petro");
        map.put("Borkeyev", "Sergiy");
        map.put("Danchenko", "Andriy");
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

        while (iter.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iter.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            if(value.equals("Andriy")){
                iter.remove();
            }
        }
        for(Map.Entry<String, String> pair : map.entrySet()) System.out.println(pair.getKey() + " : " + pair.getValue());
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
