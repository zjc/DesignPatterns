/**    
 * @{#} CPU.java Create on 2013-3-4 下午3:09:27    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.mediator.normal;

/**
 * @{# CPU.java Create on 2013-3-4 下午3:09:27
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
public class CPU extends Colleague {
	/**
	 * 视频数据
	 */
	private String videoData;
	/**
	 * 音频数据
	 */
	private String soundData;

	public CPU(IMediator mediator) {
		super(mediator);
	}

	public String getVideoData() {
		return videoData;
	}

	public String getSoundData() {
		return soundData;
	}

	/**
	 * 处理数据，把数据分解成视频数据和音频数据
	 * 
	 * @param data
	 *            被处理的数据
	 */
	public void executeData(String data) {
		// 分解数据，前面是视频数据，后面是音频数据
		String[] ss = data.split(",");
		this.videoData = ss[0];
		this.soundData = ss[1];
		// 通知主板，CPU的工作完成
		this.getMediator().changed(this);
	}

}
