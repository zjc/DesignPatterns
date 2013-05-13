package com.behavioural.iterator1;

public class ArrayIterator<E> implements IIterator<E> {

	private int position = 0;
	private Object [] objArray;
	public ArrayIterator(Object [] objArray){
		this.objArray = objArray;
	}
	@Override
	public boolean hasNext() {
		if(objArray != null && position < objArray.length)
			return true;
		return false;
	}

	@Override
	public int size() {
		return objArray != null ? objArray.length : 0;
	}

	@Override
	public E next() {
		return (E)objArray[position++];
	}

	@Override
	public E first() {
		return objArray !=null ? (E)objArray[0] : null;
	}

	@Override
	public E last() {
		return objArray !=null ? (E)objArray[size()-1] : null;
	}

}
