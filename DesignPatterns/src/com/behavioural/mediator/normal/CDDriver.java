/**    
 * @{#} CDDriver.java Create on 2013-3-4 下午3:09:17    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.mediator.normal;

/**
 * @{# CDDriver.java Create on 2013-3-4 下午3:09:17
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
public class CDDriver extends Colleague {

	/**
	 * 光盘数据
	 */
	private String data;

	public CDDriver(IMediator mediator) {
		super(mediator);
	}

	/**
	 * 获取光盘读取出来的数据
	 * 
	 * @return 光盘数据
	 */
	public String getData() {
		return data;
	}

	/**
	 * 读取光盘
	 */
	public void readCD() {
		// 逗号前是视频数据，逗号后是音频数据
		this.data = "Video Data,Sound Data";
		// 通知主板，自己的状态发生了变化
		this.getMediator().changed(this);
	}
}
