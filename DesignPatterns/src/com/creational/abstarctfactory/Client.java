/**    
 * @{#} Client.java Create on 2013-5-7 下午1:09:21    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.abstarctfactory;

/**    
 * @{#} Client.java Create on 2013-5-7 下午1:09:21    
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
		IProductFactory amdFactory = new AMDFactory();
		ICPU amdCpu = amdFactory.createCPU();
		IMainBoard amdMainBoard = amdFactory.createMotherboard();
		amdCpu.calculate();//amd的cpu计算能力
		System.out.println(amdMainBoard.interCount());//amd主板提供的接口
		
		
		IProductFactory intelFactory = new IntelFactory();
		ICPU intelCPU = intelFactory.createCPU();
		IMainBoard intelMainBoard = intelFactory.createMotherboard();
		intelCPU.calculate();
		System.out.println(intelMainBoard.interCount());
				
	}
}
