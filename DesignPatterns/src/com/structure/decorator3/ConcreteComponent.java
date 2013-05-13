/**    
 * @{#} ConcreteComponent.java Create on 2013-5-8 下午2:44:37    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.structure.decorator3;


public class ConcreteComponent implements IComponent{

	@Override
	public void operation() {
		System.out.println("需要被装饰的 operation方法");
	}
}
