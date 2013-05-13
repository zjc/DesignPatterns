/**    
 * @{#} SheepFactory.java Create on 2013-5-7 下午12:00:12    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.factorymethod;

/**    
 * @{#} SheepFactory.java Create on 2013-5-7 下午12:00:12    
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
public class SheepFactory extends AnimalFactory {

	/**
	 * 羊的工厂只生成羊
	 */
	@Override
	public IAnimal getAnimal() {
		return new Sheep();
	}

}
