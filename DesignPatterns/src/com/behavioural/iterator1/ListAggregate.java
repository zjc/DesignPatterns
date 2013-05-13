package com.behavioural.iterator1;

import java.util.List;

public class ListAggregate<E> implements IAggregate<E>{

	private List<E> lists;
	public ListAggregate(List<E> lists){
		this.lists = lists;
	}
	@Override
	public IIterator<E> createIterator() {
		return  new ListIterator<E>(lists);
	}
	
}
