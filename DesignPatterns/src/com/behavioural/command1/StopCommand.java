/**    
 * @{#} StopCommand.java Create on 2013-5-9 下午2:36:15    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.command1;

/**    
 * @{#} StopCommand.java Create on 2013-5-9 下午2:36:15    
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
public class StopCommand extends Command{

	/**
	 * @param audioPlayer
	 */
	public StopCommand(IPlayerAction playAction) {
		super(playAction);
	}

	@Override
	public void execute() {
		playAction.stop();
	}

}
