package com.behavioural.command1_1;

import com.behavioural.command.ICommand;

//添加宏 概念
//对ICommand进行扩展
public interface IMacroCommand extends ICommand{

	public void add(ICommand command);
	public void remove(ICommand command);

}
