/**    
 * @{#} ConcreteComponent.java Create on 2013-5-8 下午12:47:48    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.structure.decorator1;

/**    
 * @{#} ConcreteComponent.java Create on 2013-5-8 下午12:47:48    
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
public class ConcreteComponent implements IComponent{

	@Override
	public void operation() {
		System.out.println("需要被装饰的 operation方法");
	}
}
