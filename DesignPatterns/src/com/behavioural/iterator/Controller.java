package com.behavioural.iterator;

import java.util.Vector;

public class Controller implements IIterator {

	private int current = 0;
	Vector<Item> channel;

	public Controller(Vector<Item> v) {
		current = 0;
		channel = v;
	}

	@Override
	public Item first() {
		current = 0;
		return channel.get(current);
	}
	
	private boolean isFirst = true;

	@Override
	public Item next() {
		if(isFirst){
			isFirst = false;
			return channel.get(0);
		}
		current++;
		return channel.get(current);
	
		
	}

	@Override
	public boolean isLast() {
		return current >= channel.size() -1;
	}

	@Override
	public Item currentItem() {
		return channel.get(current);
	}

	@Override
	public int size() {
		return channel.size();
	}

}
