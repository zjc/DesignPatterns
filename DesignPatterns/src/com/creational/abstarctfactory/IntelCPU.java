/**    
 * @{#} IntelCPU.java Create on 2013-5-7 下午12:56:19    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.abstarctfactory;

/**    
 * @{#} IntelCPU.java Create on 2013-5-7 下午12:56:19    
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
public class IntelCPU implements ICPU{
	
	public IntelCPU(){
		System.out.println("在Intel的工厂:生产Intel的CPU!");
	}
	@Override
	public void calculate() {
		System.out.println("Intel CPU计算能力!");
	}

}
