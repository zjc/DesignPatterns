/**    
 * @{#} ICommand.java Create on 2013-5-4 上午8:49:22    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.command;

/**    
 * @{#} ICommand.java Create on 2013-5-4 上午8:49:22    
 *    
 * class desc:   命令(ICommand)角色：声明了一个给所有具体命令类的抽象接口
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public interface ICommand {
	public void execute();
}
