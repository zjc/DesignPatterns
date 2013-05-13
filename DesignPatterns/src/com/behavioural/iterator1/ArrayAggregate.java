package com.behavioural.iterator1;

public class ArrayAggregate<E> implements IAggregate<E> {
	private Object[] objs;

	public ArrayAggregate(Object[] objs) {
		this.objs = objs;
	}

	@Override
	public IIterator<E> createIterator() {
		return new ArrayIterator<E>(objs);
	}

}
