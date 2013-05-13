/**    
 * @{#} Waiter.java Create on 2013-5-7 下午5:25:11    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.builder2;

/**    
 * @{#} Waiter.java Create on 2013-5-7 下午5:25:11    
 *    
 * class desc:  服务员 
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public class Waiter {
	private MealBuilder mb;

	public void setMb(MealBuilder mb) {
		this.mb = mb;
	}
	
	public Meal getMeal(){
		mb.createFood();
		mb.createDrink();
		return mb.getMeal();
	}
	
}
