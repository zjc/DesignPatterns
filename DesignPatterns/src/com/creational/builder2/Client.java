/**    
 * @{#} Client.java Create on 2013-5-7 下午5:26:49    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.builder2;

/**    
 * @{#} Client.java Create on 2013-5-7 下午5:26:49    
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
public class Client {

	public static void main(String[] args) {
		//客户点了 套餐A
		MealBuilder mb = new SubMealBuilderA();
		Waiter waiter = new Waiter();
		waiter.setMb(mb);
		Meal meal = waiter.getMeal();//服务员拿来食物
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
		//另外一个客户点了 套餐B
		MealBuilder mb2 = new SubMealBuilderB();
		waiter.setMb(mb2);
		meal = waiter.getMeal();//服务员拿来食物
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}

}
