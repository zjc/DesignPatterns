/**    
 * @{#} Iterator.java Create on 2013-5-9 下午4:38:00    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.iterator;

/**    
 * @{#} Iterator.java Create on 2013-5-9 下午4:38:00    
 *    
 * class desc:   迭代器接口
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public interface IIterator {
	public Item first();
	public Item next();
	public boolean isLast();
	public Item currentItem();
	
	public int size();
}
