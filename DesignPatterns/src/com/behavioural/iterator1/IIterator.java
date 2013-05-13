package com.behavioural.iterator1;

public interface IIterator<E> {
	public boolean hasNext();//是否有下一个元素
	public int size();//迭代长度
	public E next();//下一个元素
	public E first();//迭代器第一个元素
	public E last();//迭代器最后一个元素
	
}
