/**    
 * @{#} IMemberStrategy.java Create on 2013-5-10 下午5:00:41    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.strategy1;

/**    
 * @{#} IMemberStrategy.java Create on 2013-5-10 下午5:00:41    
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
public interface IMemberStrategy {
	/**
	 * method desc：计算商品的价格
	 * @param price
	 * @return
	 */
	public double calcPrice(double price);

}
