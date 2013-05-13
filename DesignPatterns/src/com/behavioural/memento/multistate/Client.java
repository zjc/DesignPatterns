/**    
 * @{#} Client.java Create on 2013-2-26 锟斤拷锟斤拷11:30:29    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.memento.multistate;


public class Client {

	
	public static void main(String[] args) {
		 Originator ori = new Originator();  
	        Caretaker caretaker = new Caretaker();  
	        ori.setState1("中国");  
	        ori.setState2("强盛");  
	        ori.setState3("繁荣");  
	        System.out.println("===初始化状态===\n"+ori);  
	          
	        caretaker.setMemento("001",ori.createMemento());  
	        ori.setState1("软件");  
	        ori.setState2("架构");  
	        ori.setState3("优秀");  
	        System.out.println("===修改后状态===\n"+ori);  
	          
	        ori.restoreMemento(caretaker.getMemento("001"));  
	        System.out.println("===恢复后状态===\n"+ori); 
	}

}
