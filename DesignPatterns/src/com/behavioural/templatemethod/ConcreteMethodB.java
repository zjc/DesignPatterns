package com.behavioural.templatemethod;

public class ConcreteMethodB extends AbstractMethod {

	@Override
	public void method1() {
		System.out.println("具体子类B：method1() 方法");
	}

	@Override
	public void method2() {
		System.out.println("具体子类B：method2() 方法");
	}
	
	@Override
	protected boolean hookMethod() {
		return false;
	}

}
