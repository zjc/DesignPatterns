package com.behavioural.iterator1;

import java.util.List;


public class ListIterator<E> implements IIterator<E> {

	private int position = 0;
	private List<E> objList;
	public ListIterator(List<E> objList){
		this.objList = objList;
	}
	@Override
	public boolean hasNext() {
		if(objList != null && position < objList.size())
			return true;
		return false;
	}

	@Override
	public int size() {
		return objList != null ? objList.size() : 0;
	}

	@Override
	public E next() {
		return (E)objList.get(position++);
	}

	@Override
	public E first() {
		return (E)objList.get(0);
	}

	@Override
	public E last() {
		return (E)objList.get(size()-1);
	}

}
