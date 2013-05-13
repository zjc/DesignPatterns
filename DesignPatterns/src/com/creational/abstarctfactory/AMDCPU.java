/**    
 * @{#} AMDCPU.java Create on 2013-5-7 下午12:58:30    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.abstarctfactory;

/**    
 * @{#} AMDCPU.java Create on 2013-5-7 下午12:58:30    
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
public class AMDCPU implements ICPU {

	public AMDCPU(){
		System.out.println("在AMD的工厂:生产AMD的CPU");
	}
	
	@Override
	public void calculate() {
		System.out.println("AMD CPU计算能力!");

	}

}
