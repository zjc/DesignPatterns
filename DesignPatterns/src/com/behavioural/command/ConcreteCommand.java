   
package com.behavioural.command;

public class ConcreteCommand implements ICommand{
 
	//持有接受者的引用
	private IReceiver receiver;

	public ConcreteCommand(IReceiver receiver){
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		receiver.onReceiver();
	}

}
