/**    
 * @{#} Son.java Create on 2013-5-8 上午11:22:44    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.structure.decorator;

/**    
 * @{#} Son.java Create on 2013-5-8 上午11:22:44    
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
public class Son implements IWork{

	@Override
	public void paint() {
		System.out.println("儿子用铅笔画了一幅画");
	}



}
