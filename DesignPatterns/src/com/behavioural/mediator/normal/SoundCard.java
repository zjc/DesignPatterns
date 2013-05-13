/**    
 * @{#} SoundCard.java Create on 2013-3-4 下午3:10:05    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.mediator.normal;

/**
 * @{# SoundCard.java Create on 2013-3-4 下午3:10:05
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
public class SoundCard extends Colleague {

	public SoundCard(IMediator mediator) {
		super(mediator);
	}

	/**
	 * 发出声音
	 * 
	 * @param data
	 *            音频数据
	 */
	public void soundData(String data) {
		System.out.println("画外音：" + data);
	}

}
