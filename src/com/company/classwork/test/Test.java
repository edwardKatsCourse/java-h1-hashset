package com.company.classwork.test;

import com.company.classwork.model.MyHashSet;

import java.util.*;


public class Test {

    private static final int NUM_NUM = 30;
    static Random gen = new Random();

    public static void main(String[] args) {

        ArrayList<Integer> ali = new ArrayList<>();
        for (int i = 40; i < 70; i++) {
            ali.add(i);
        }

        MyHashSet<Integer> hashSet = new MyHashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(i+1);
        }
        System.out.println("Before");
        System.out.println(hashSet.size());

//        hashSet.remove(1);
//        System.out.println("After");
//        System.out.println(hashSet.size());

        System.out.println(hashSet);
        boolean addAll = hashSet.addAll(Arrays.asList(1, 2, 11, 3 ));
        System.out.println("addAll()");
        System.out.println(addAll);
        System.out.println(hashSet);

        System.out.println();
        System.out.println();
        System.out.println();

        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        boolean hashSetAddAll = integers.addAll(Arrays.asList(1, 2, 3, 11));
        System.out.println("hashSetAddAll");
        System.out.println(hashSetAddAll);
        System.out.println(integers);
//        System.out.println(mhsi);
//        System.out.println(mhsi.retainAll(ali));
//        System.out.println(mhsi);

        System.out.println();

        for (Integer s : new A()/*.iterator()*/) {

        }
    }

}


class A implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}