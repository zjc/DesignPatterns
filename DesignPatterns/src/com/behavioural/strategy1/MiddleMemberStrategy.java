/**    
 * @{#} PrimaryMemberStrategy.java Create on 2013-5-10 下午5:02:14    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.strategy1;

/**    
 * @{#} PrimaryMemberStrategy.java Create on 2013-5-10 下午5:02:14    
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
public class MiddleMemberStrategy implements IMemberStrategy{

	/**
	 * 中级会员享受9折折扣
	 */
	@Override
	public double calcPrice(double price) {
		return price * 0.9;
	}

}
