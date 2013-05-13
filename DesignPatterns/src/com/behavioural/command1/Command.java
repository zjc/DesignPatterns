/**    
 * @{#} Command.java Create on 2013-5-9 下午2:32:02    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.command1;

import com.behavioural.command.ICommand;

/**    
 * @{#} Command.java Create on 2013-5-9 下午2:32:02    
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
public abstract class Command implements ICommand{

	protected IPlayerAction playAction;

	public Command(IPlayerAction playAction){
		this.playAction = playAction;
	}

}
