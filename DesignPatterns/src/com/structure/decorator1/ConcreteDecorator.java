/**    
 * @{#} ConcreteDecorator.java Create on 2013-5-8 下午12:51:35    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.structure.decorator1;

/**
 * @{# ConcreteDecorator.java Create on 2013-5-8 下午12:51:35
 * 
 *     class desc:
 * 
 *     <p>
 *     Copyright: Copyright(c) 2013
 *     </p>
 *     <p>
 *     Company: morelap
 *     </p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>
 * 
 * 
 */
public class ConcreteDecorator extends Decorator {

	/**
	 * @param component
	 */
	public ConcreteDecorator(IComponent component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		addBehavior();
	}

	public void addBehavior() {
		System.out.println("装饰者添加的行为方法!");
	}

}
