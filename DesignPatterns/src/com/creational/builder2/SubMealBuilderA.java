/**    
 * @{#} SubMealBuilderA.java Create on 2013-5-7 下午5:20:59    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.builder2;

/**    
 * @{#} SubMealBuilderA.java Create on 2013-5-7 下午5:20:59    
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
public class SubMealBuilderA extends MealBuilder{

	@Override
	public void createFood() {
		meal.setFood("大米饭");
	}

	@Override
	public void createDrink() {
		meal.setDrink("啤酒");
	}



}
