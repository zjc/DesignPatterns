/**    
 * @{#} Mother.java Create on 2013-5-8 上午11:23:02    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.structure.decorator;

/**
 * @{# Mother.java Create on 2013-5-8 上午11:23:02
 * 
 *     class desc:
 * 
 *     <p>
 *     Copyright: Copyright(c) 2013
 *     </p>
 *     <p>
 *     Company: morelap
 *     </p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>
 * 
 * 
 */
public class Mother implements IWork {

	private IWork work;

	public Mother(IWork work) {
		this.work = work;
	}

	@Override
	public void paint() {
		System.out.println("妈妈正在做给画上颜色前的准备工作");
		work.paint();
		System.out.println("妈妈完成对画上色的工作");
	}

}
