/**    
 * @{#} Price.java Create on 2013-5-10 下午5:04:58    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.strategy1;

/**    
 * @{#} Price.java Create on 2013-5-10 下午5:04:58    
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
public class Price {
	private IMemberStrategy strategy;
	public Price(IMemberStrategy strategy){
		this.strategy = strategy;
	}
	
	public double quote(double price){
		return strategy.calcPrice(price);
	}
}
