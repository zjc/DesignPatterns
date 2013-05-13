/**    
 * @{#} RewindCommand.java Create on 2013-5-9 下午2:34:57    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.command1;

public class RewindCommand extends Command{

	public RewindCommand(IPlayerAction playAction) {
		super(playAction);
	}

	

	
	@Override
	public void execute() {
		playAction.rewind();
	}

}
