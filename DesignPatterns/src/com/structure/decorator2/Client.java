package com.structure.decorator2;

public class Client {

	public static void main(String[] args) {
		ConcreteComponent component = new ConcreteComponent();
		ConcreteDecorator decorator = new ConcreteDecorator(component);
		decorator.operation();
	}

}
