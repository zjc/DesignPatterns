/**    
 * @{#} Colleague.java Create on 2013-3-4 下午3:07:12    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.mediator.normal;

/**
 * @{# Colleague.java Create on 2013-3-4 下午3:07:12
 * 
 *     类功能说明: 所有同事类的抽象父类
 * 
 *     <p>
 *     Copyright: Copyright(c) 2010
 *     </p>
 *     <p>
 *     Company: skysation
 *     </p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>
 * 
 * 
 */
public class Colleague {
	/**
	 * 持有中介者对象，每一个同事类都知道它的中介者对象
	 */
	private final IMediator mediator;

	/**
	 * 构造方法，传入中介者对象
	 * 
	 * @param mediator
	 *            中介者对象
	 */
	public Colleague(IMediator mediator) {
		this.mediator = mediator;
	}

	/**
	 * 获得当前同事类对应的中介者对象
	 * 
	 * @return 对应的中介者对象
	 */
	public IMediator getMediator() {
		return mediator;
	}

}
