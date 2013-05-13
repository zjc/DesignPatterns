/**    
 * @{#} AudioPlayer.java Create on 2013-5-9 下午2:29:01    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.command1;

/**    
 * @{#} AudioPlayer.java Create on 2013-5-9 下午2:29:01    
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
public class AudioPlayer implements IPlayerAction{
	//播放
	public void play(){
		System.out.println("play");
	}
	
	//倒带
	public void rewind(){
		System.out.println("rewind");
	}

	//停止
	public void stop(){
		System.out.println("stop");
	}
}
