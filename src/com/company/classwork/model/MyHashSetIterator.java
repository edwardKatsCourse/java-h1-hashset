package com.company.classwork.model;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyHashSetIterator<T> implements Iterator<T>  {
		
	private ArrayList<LinkedList<T>> hs;
	private Iterator<LinkedList<T>> alIterator;
	private LinkedList<T> currentLL;
	private Iterator<T> prevIt;
	private Iterator<T> it;
		

	public MyHashSetIterator(ArrayList<LinkedList<T>> hs) {
		super();
		this.hs = hs;
		alIterator = hs.iterator();
		currentLL = nextLL();
	}

	private LinkedList<T> nextLL() {
		LinkedList<T> res = null;
		while(alIterator.hasNext()){
			LinkedList<T> ll = alIterator.next();
			if (ll.size() != 0) {
				res = ll;
				break;
			}
		}
		if (res != null) it = res.iterator();
		return res;
	}

	@Override
	public boolean hasNext() {
		return currentLL != null;
	}

	@Override
	public T next() {
		if (!hasNext()) throw new NoSuchElementException();
			 
		T res = it.next();
		prevIt = it;
		if (!it.hasNext())	currentLL = nextLL();
		return res;
	}
		
	@Override
	public void remove(){
		try {prevIt.remove();} catch (Exception e) {}
	}
}
