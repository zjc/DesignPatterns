/**    
 * @{#} Invoke.java Create on 2013-5-9 上午9:51:49    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.command;

/**    
 * @{#} Invoke.java Create on 2013-5-4 上午9:51:49    
 *    
 * class desc:   请求者(Invoker)角色：负责调用命令对象执行请求，相关的方法叫做行动方法
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public class Invoker {

	private ICommand cmd;
	public Invoker(ICommand cmd){
		this.cmd = cmd;
	}
	
	public void action(){
		cmd.execute();
	}
}
