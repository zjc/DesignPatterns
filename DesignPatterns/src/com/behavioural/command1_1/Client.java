package com.behavioural.command1_1;

import com.behavioural.command.ICommand;
import com.behavioural.command1.AudioPlayer;
import com.behavioural.command1.IPlayerAction;
import com.behavioural.command1.PlayCommand;
import com.behavioural.command1.RewindCommand;
import com.behavioural.command1.StopCommand;


public class Client {

	/**
	 * method desc：
	 * @param args
	 */
	public static void main(String[] args) {
		IPlayerAction audioPlayer = new AudioPlayer();
		ICommand playCommand = new PlayCommand(audioPlayer);
		ICommand rewindCommand = new RewindCommand(audioPlayer);
		ICommand stopCommand = new StopCommand(audioPlayer);
		
		//添加命令队列
		IMacroCommand macroCommand = new MacroAudioCommand();
		macroCommand.add(playCommand);
		macroCommand.add(rewindCommand);
		macroCommand.add(stopCommand);
		
		macroCommand.execute();
		System.out.println("=======");
		//移除stop command
		macroCommand.remove(stopCommand);
		macroCommand.execute();
		
	}

}
