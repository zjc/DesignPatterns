    
package com.structure.decorator3;


public class Client {

	public static void main(String[] args) {
		IComponent component = new ConcreteComponent();
		IComponent decorator = new ConcreteDecorator(component);
		decorator.operation();
	}

}
