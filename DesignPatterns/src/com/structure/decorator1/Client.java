/**    
 * @{#} Client.java Create on 2013-5-8 下午12:53:39    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.structure.decorator1;

/**
 * @{# Client.java Create on 2013-5-8 下午12:53:39
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
public class Client {

	public static void main(String[] args) {
		// 需要被装饰者的类
		IComponent component = new ConcreteComponent();
		IComponent decorator = new ConcreteDecorator(component);
		decorator.operation();
	}

}
