package com.company.classwork.model;

import java.util.Collection;

public interface IHashSet<T> extends Iterable<T> {
	public boolean add(T data);
	public boolean addAll(Collection<T> c);
	public void clear();
	public boolean contains(T subject);
	public boolean containsAll(Collection<T> c);
	public boolean isEmpty();
	public boolean retainAll(Collection<T> c);
	public boolean remove(T subject);
	public boolean removeAll(Collection<T> c);
	public int size();	
}


