    
package com.behavioural.command1_1;

import java.util.ArrayList;
import java.util.List;

import com.behavioural.command.ICommand;

public class MacroAudioCommand implements IMacroCommand{

	public List<ICommand> commandList = new ArrayList<ICommand>();
	
	@Override
	public void execute() {
		if(null != commandList && commandList.size() >0){
			for(ICommand command : commandList){
				command.execute();
			}
		}
	}

	
	@Override
	public void add(ICommand command) {
		commandList.add(command);
	}

	
	@Override
	public void remove(ICommand command) {
		commandList.remove(command);
	}



}
