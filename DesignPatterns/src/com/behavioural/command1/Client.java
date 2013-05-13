   
package com.behavioural.command1;

import com.behavioural.command.ICommand;

public class Client {

	/**
	 * method desc：
	 * @param args
	 */
	public static void main(String[] args) {
		//创建接受者对象
		IPlayerAction playAction = new AudioPlayer();
		//创建命令对象
		ICommand playCommand = new PlayCommand(playAction);
		ICommand rewindCommand = new RewindCommand(playAction);
		ICommand stopCommand = new StopCommand(playAction);
		//创建请求者对象
		Keypad keypad = new Keypad();
		
		keypad.setPlayCommand(playCommand);
		keypad.setRewindCommand(rewindCommand);
		keypad.setStopCommand(stopCommand);
		
		//test
		keypad.play();
		keypad.rewind();
		keypad.stop();
		keypad.rewind();
        keypad.stop();
        keypad.play();
		
	}

}
