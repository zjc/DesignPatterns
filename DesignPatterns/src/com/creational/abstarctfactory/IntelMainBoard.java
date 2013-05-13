/**    
 * @{#} IntelMainBoard.java Create on 2013-5-7 下午1:02:45    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.abstarctfactory;

/**    
 * @{#} IntelMainBoard.java Create on 2013-5-7 下午1:02:45    
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
public class IntelMainBoard implements IMainBoard{

	public IntelMainBoard(){
		System.out.println("在Intel的工厂:生成Intel的主板!");
	}
	@Override
	public int interCount() {
		return 12;
	}

}
