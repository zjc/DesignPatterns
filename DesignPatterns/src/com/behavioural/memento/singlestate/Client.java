/**    
 * @{#} Client.java Create on 2013-2-26 ����9:25:16    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.memento.singlestate;


public class Client {
	public static void main(String[] args) {
		 Originator originator = new Originator();  
	        originator.setState("状态1");  
	        System.out.println("初始状态:"+originator.getState());  
	        Caretaker caretaker = new Caretaker();  
	        caretaker.setMemento(originator.createMemento());  
	        originator.setState("状态2");  
	        System.out.println("改变后状态:"+originator.getState());  
	        originator.restoreMemento(caretaker.getMemento());  
	        System.out.println("恢复后状态:"+originator.getState());  

	}
}
