    
package com.behavioural.command1;


public class PlayCommand extends Command{

	public PlayCommand(IPlayerAction playAction) {
		super(playAction);
	}

	@Override
	public void execute() {
		playAction.play();
	}

	

}
