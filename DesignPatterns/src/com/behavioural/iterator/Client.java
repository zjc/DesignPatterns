package com.behavioural.iterator;

public class Client {
	public static void main(String[] args) {
		ITelevision television = new TCLTV();
		IIterator iterator = television.createIterator();
		System.out.println("first:"+iterator.first().getName());
		System.out.println(iterator.size());
		while(!iterator.isLast()){
			Item item = iterator.next();
			System.out.println("index:"+item.getItemId()+"->"+item.getName());
		}
	}
}
