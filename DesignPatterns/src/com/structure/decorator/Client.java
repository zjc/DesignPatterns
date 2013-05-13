/**    
 * @{#} Client.java Create on 2013-5-8 上午11:41:12    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.structure.decorator;

/**    
 * @{#} Client.java Create on 2013-5-8 上午11:41:12    
 *    
 * class desc:   
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public class Client {

	/**
	 * method desc：
	 * @param args
	 */
	public static void main(String[] args) {
		IWork son = new Son();
		son.paint();
		System.out.println("=================");
		IWork mother = new Mother(son);
		mother.paint();
		System.out.println("=================");
		IWork father = new Father(mother);
		father.paint();
		System.out.println("=================");
		
	}

}
