/**    
 * @{#} Decorator.java Create on 2013-5-8 下午12:49:14    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.structure.decorator1;

/**    
 * @{#} Decorator.java Create on 2013-5-8 下午12:49:14    
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
public class Decorator implements IComponent{

	private IComponent component;
	public Decorator(IComponent component){
		this.component = component;
	}
	@Override
	public void operation() {
		component.operation();
	}

	

}
