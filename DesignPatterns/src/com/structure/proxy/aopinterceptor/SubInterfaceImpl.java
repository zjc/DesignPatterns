/**    
 * @{#} SubInterfaceImpl.java Create on 2013-5-8 上午10:27:36    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.structure.proxy.aopinterceptor;

public class SubInterfaceImpl implements ISubInterface{

	@Override
	public void add(String value1, String value2) {
		 System.out.println("SubInterfaceImpl add(String value1,String value2)"); 
	}

	@Override
	public void acc(String value1) {
		System.out.println("SubInterfaceImpl acc(String value1)");  
	}

	

}
