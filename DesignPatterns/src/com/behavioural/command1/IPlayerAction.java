/**    
 * @{#} IPlayerAction.java Create on 2013-5-9 下午2:39:50    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.command1;

/**    
 * @{#} IPlayerAction.java Create on 2013-5-9 下午2:39:50    
 *    
 * class desc:  定义播放器的一系列动作 
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public interface IPlayerAction {
	public void play();
	public void rewind();
	public void stop();
}
