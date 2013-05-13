/**    
 * @{#} Decorator.java Create on 2013-5-8 下午2:24:29    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.structure.decorator2;

/**    
 * @{#} Decorator.java Create on 2013-5-8 下午2:24:29    
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
public class Decorator extends ConcreteComponent{

	public ConcreteComponent component;
	
	public Decorator(ConcreteComponent component){
		this.component = component;
	}
	@Override
	public void operation() {
		component.operation();
	}

}
