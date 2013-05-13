/**    
 * @{#} MainBoard.java Create on 2013-3-4 下午3:07:57    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.mediator.normal;

/**
 * @{# MainBoard.java Create on 2013-3-4 下午3:07:57
 * 
 *     类功能说明: 主板类，作为具体的中介者实现类
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
public class MainBoard implements IMediator {

	private CDDriver cdDriver;
	private CPU cpu;
	private VideoCard videoCard;
	private SoundCard soundCard;

	@Override
	public void changed(Colleague colleague) {
		if (colleague == cdDriver) {
			// 表示光驱读取了数据
			this.operateCDDriverReadData((CDDriver) colleague);
		} else if (colleague == cpu) {
			// 表示CPU处理完数据
			this.operateCPU((CPU) colleague);
		}
	}

	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}

	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}

	/**
	 * 处理光驱读取数据后与其他对象的交互
	 * 
	 * @param cd
	 */
	public void operateCDDriverReadData(CDDriver cd) {
		String data = cd.getData();
		this.cpu.executeData(data);
	}

	/**
	 * 处理CPU处理完数据后与其他对象的交互
	 * 
	 * @param cpu
	 */
	public void operateCPU(CPU cpu) {
		String videoData = cpu.getVideoData();
		String soundData = cpu.getSoundData();
		this.videoCard.showData(videoData);
		this.soundCard.soundData(soundData);
	}

}
