/**    
 * @{#} IReceiver.java Create on 2013-5-9 上午9:59:12    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.command;

/**    
 * @{#} IReceiver.java Create on 2013-5-9 上午9:59:12    
 *    
 * class desc:   接收者(Receiver)角色：负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public interface IReceiver {
	public void onReceiver();
}
