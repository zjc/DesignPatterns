/**    
 * @{#} SqlServerDB.java Create on 2013-5-7 下午2:11:05    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.simplefactory;

/**    
 * @{#} SqlServerDB.java Create on 2013-5-7 下午2:11:05    
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
public class SqlServerDB implements IDB{

	@Override
	public void getDB() {
		System.out.println("得到SqlServer数据库对象");
	}

}
