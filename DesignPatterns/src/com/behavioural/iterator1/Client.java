package com.behavioural.iterator1;

import java.util.ArrayList;
import java.util.List;

public class Client {
	static String[] arrays = new String [10];  
    static List<String> lists = new ArrayList<String>();  
    static {  
    	for(int i = 0;i<10;i++){
    		 lists.add("L"+i);
    		 arrays[i] = "A"+i;
    	}
    }  
      
    public static void main(String[] args) {  
          
    	IIterator<String> arrayIterator = new ArrayAggregate<String>(arrays).createIterator();  
    	IIterator<String> listIterator = new ListAggregate<String>(lists).createIterator();  
          
        printIterator(arrayIterator);
        System.out.println("===========");
        printIterator(listIterator);  
    }  
      
    private static void printIterator(IIterator iterator) {  
        while(iterator.hasNext()) {  
            System.out.println(iterator.next());  
        }  
    }  

}
