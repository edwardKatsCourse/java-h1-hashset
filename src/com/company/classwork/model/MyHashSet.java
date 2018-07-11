package com.company.classwork.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSet<T> implements IHashSet<T> {

    private ArrayList<LinkedList<T>> hs = new ArrayList<>();
    private int capacity = 16;
    private int size = 0;

    public MyHashSet() {
        for (int i = 0; i < capacity; i++) {
            hs.add(new LinkedList<T>());
        }
    }

    public MyHashSet(Collection<T> c) {
        this();
        addAll(c);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyHashSetIterator<>(hs);
    }

    @Override
    public boolean add(T data) {
        //из 100 элементов в HashSet може быть не больше 6-7 элементов в одном bucket (Linked List)
        LinkedList<T> bucket = getLinkedList(data);
        if (bucket.contains(data)) {
            return false;
        }
        bucket.add(data);
        size++;
        return true;
    }

    private LinkedList<T> getLinkedList(T data) {
        return hs.get(Math.abs(data.hashCode()) % capacity);
    }

    @Override
    public boolean addAll(Collection<T> c) {
        boolean res = false;
        for (T t : c) {
            res = add(t) || res;
        }
        return res;
    }

    @Override
    public void clear() {
        freeLL();
        size = 0;
    }

    private void freeLL() {
        for (LinkedList<T> ll : hs) {
            ll.clear();
        }
    }

    @Override
    public boolean contains(T subject) {
        return getLinkedList(subject).contains(subject);
    }

    @Override
    public boolean containsAll(Collection<T> c) {
        for (T t : c) {
            if (!contains(t)) return false;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean retainAll(Collection<T> c) {
        Iterator<T> it = iterator();
        boolean res = false;
        while (it.hasNext()) {
            if (!c.contains(it.next())) {
                it.remove();
                size--;
                res = true;
            }
        }
        return res;
    }

    @Override
    public boolean remove(T subject) {
        LinkedList<T> ll = getLinkedList(subject);

        boolean wasRemoved = ll.remove(subject);
        if (wasRemoved) {
            size--;
        }

        return wasRemoved;
    }

    @Override
    public boolean removeAll(Collection<T> c) {
        boolean res = false;
        for (T t : c) {
            res = remove(t) || res;
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (T t : this) sb.append(t + ", ");
        int l2 = sb.length() - 2;
        return (l2 > 0 ? sb.substring(0, l2) : sb).toString() + "]";
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            System.out.print(i + "\t");
            System.out.println(hs.get(i));
        }
    }

}
