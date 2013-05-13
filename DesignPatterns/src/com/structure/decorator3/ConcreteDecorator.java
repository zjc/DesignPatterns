package com.structure.decorator3;

public class ConcreteDecorator implements IComponent {

	private IComponent component; 
	public ConcreteDecorator(IComponent component){
		this.component = component;
	}
	@Override
	public void operation() {
		component.operation();
		addBehavior();
	}
	
	public void addBehavior(){
		System.out.println("装饰者添加的行为方法");
	}



}
