/**    
 * @{#} MealBuilder.java Create on 2013-5-7 下午5:17:07    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.builder2;

/**    
 * @{#} MealBuilder.java Create on 2013-5-7 下午5:17:07    
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
public abstract class MealBuilder {

	protected Meal meal = new Meal();
	public abstract void createFood();
	public abstract void createDrink();
	
	public Meal getMeal(){
		return meal;
	}

}
