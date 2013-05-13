/**    
 * @{#} IProductFactory.java Create on 2013-5-7 下午1:05:41    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.abstarctfactory;

/**    
 * @{#} IProductFactory.java Create on 2013-5-7 下午1:05:41    
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
public abstract class IProductFactory {
	 public abstract ICPU createCPU();//生产cpu
     public abstract IMainBoard createMotherboard();//生产主板
     //...生成鼠标,键盘,显卡.....
}
