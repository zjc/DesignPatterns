/**    
 * @{#} DogFactory.java Create on 2013-5-7 上午11:54:40    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.factorymethod;

/**    
 * @{#} DogFactory.java Create on 2013-5-7 上午11:54:40    
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
public class DogFactory extends AnimalFactory {

	/**
	 * 狗的工厂 只生成小狗
	 */
	@Override
	public IAnimal getAnimal() {
		return new Dog();
	}
	
}
