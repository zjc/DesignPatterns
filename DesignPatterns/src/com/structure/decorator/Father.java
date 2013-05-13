/**    
 * @{#} Father.java Create on 2013-5-8 上午11:23:14    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.structure.decorator;

/**    
 * @{#} Father.java Create on 2013-5-8 上午11:23:14    
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
public class Father implements IWork{
	
	private IWork work;

	public Father(IWork work){
		this.work = work;
	}
	
	@Override
	public void paint() {
		System.out.println("爸爸正在为画做装相框的准备工作");
		work.paint();
		System.out.println("相框安装完成!");
	}

	

}
