/**    
 * @{#} Sheep.java Create on 2013-5-7 上午11:52:13    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.factorymethod;

/**    
 * @{#} Sheep.java Create on 2013-5-7 上午11:52:13    
 *    
 * class desc:   羊 类
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public class Sheep implements IAnimal{

	@Override
	public void eat() {
		System.out.println("羊吃草！");
	}
	
}
