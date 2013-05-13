   
package com.behavioural.command;
public class Client {

	
	public static void main(String[] args) {
		IReceiver receiver = new Receiver();
		ICommand cmd = new ConcreteCommand(receiver);
		Invoker invoke = new Invoker(cmd);
		invoke.action();
	}

}
