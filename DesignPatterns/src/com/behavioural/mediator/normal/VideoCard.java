/**    
 * @{#} VideoCard.java Create on 2013-3-4 下午3:09:50    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.mediator.normal;

/**
 * @{# VideoCard.java Create on 2013-3-4 下午3:09:50
 * 
 *     类功能说明:
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
public class VideoCard extends Colleague {

	public VideoCard(IMediator mediator) {
		super(mediator);
	}

	/**
	 * 显示视频数据
	 * 
	 * @param data
	 *            被显示的数据
	 */
	public void showData(String data) {
		System.out.println("你正在观看的是：" + data);
	}
}
