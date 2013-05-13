package com.structure.decorator2;
public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(ConcreteComponent component) {
		super(component);
	}

	
	@Override
	public void operation() {
		super.operation();
		addBehavior();
	}
	
	public void addBehavior(){
		System.out.println("装饰者添加的行为方法!");
	}
	

}
