package com.company.webinar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSetExample {

    public static void main(String[] args) {
        //Set
        //HashSet
        //TreeSet
        //LinkedHashSet

        //Хранит ТОЛЬКО уникальные элементы (не хранит дубликаты)
        //List vs Set:
        // - Set имеет доступ по значению
        // - List имеет доступ по индексу

        // - Set хранит ТОЛЬКО уникальные элементы (не хранит дубликаты)
        // - List хранит все, что добавили

        // - Set - не гарантирует последовательность
        // - List - хранение последовательное
        //set.add(Natalie)
        //set.add(Ivan)
        //set.add(Jane)
        //set.add(Alex)

        //sout(set) -> Jane, Ivan, Alex ...


        // - Set - для проверки на дибликаты и защиты от дублирующих объектов
        // - List - для хранения и ДОСТУПА к объектам

//        String [] array = new String[1_000_000_000];
//        System.out.println(array[9]);

//        for (int i = 0; i < array.length; i++) {
//            if (array[i].equals("")) ;
//        }

//        ArrayList<String> objects = new ArrayList<>();
//        for (int i = 0; i < objects.size(); i++) {
//            System.out.println(objects.get(i));
//        }

        //paveli@site.com Pavel Ivanov
        //paveli@site.com Pavel Igorev

        Set<String> stringSet = new HashSet<>();

        stringSet.add("a"); //1 - 2
        stringSet.add("b"); //2 - 4
        stringSet.add("c"); //3 - 5
        stringSet.add("aa");//4 - 1
        stringSet.add("ca");//5 - 6
        stringSet.add("ab");//6 - 3

        System.out.println(stringSet);

        stringSet.remove("a");
        System.out.println(stringSet);

        List<String> stringList = new ArrayList<>();
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e"); //hashCode() = 12, equals | contains

        System.out.println("Add all");
        stringSet.addAll(stringList);
        System.out.println(stringSet);
        System.out.println();
        System.out.println("Remove all");
        stringSet.removeAll(stringList);
        System.out.println(stringSet);

//        String searchFor = "a";
//        for (String currentElement : stringSet) {
//            if (searchFor.equals(currentElement)) {
//                ....
//            }
//        }
    }
}
