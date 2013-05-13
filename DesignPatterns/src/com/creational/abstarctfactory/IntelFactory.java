/**    
 * @{#} IntelFactory.java Create on 2013-5-7 下午1:08:18    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.abstarctfactory;

/**    
 * @{#} IntelFactory.java Create on 2013-5-7 下午1:08:18    
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
public class IntelFactory extends IProductFactory{

	@Override
	public ICPU createCPU() {
		return new IntelCPU();
	}

	@Override
	public IMainBoard createMotherboard() {
		return new IntelMainBoard();
	}

}
