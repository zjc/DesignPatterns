/**    
 * @{#} ConcreteStateA.java Create on 2013-5-10 下午2:24:42    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.state;

/**    
 * @{#} ConcreteStateA.java Create on 2013-5-10 下午2:24:42    
 *    
 * class desc:   具体的状态类
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public class ConcreteStateA implements IState {

	@Override
	public void handle(String param) {
		System.out.println("ConcreteStateA handle:"+param);
	}

}
