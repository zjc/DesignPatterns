package com.behavioural.command1;

import com.behavioural.command.ICommand;


public class Keypad implements IPlayerAction{
	private ICommand playCommand;
	private ICommand rewindCommand;
	private ICommand stopCommand;
	public void setPlayCommand(ICommand playCommand) {
		this.playCommand = playCommand;
	}
	public void setRewindCommand(ICommand rewindCommand) {
		this.rewindCommand = rewindCommand;
	}
	public void setStopCommand(ICommand stopCommand) {
		this.stopCommand = stopCommand;
	}
	
	@Override
	public void play() {
		playCommand.execute();
	}
	
	@Override
	public void rewind() {
		rewindCommand.execute();
	}
	
	@Override
	public void stop() {
		stopCommand.execute();		
	}
	

}
