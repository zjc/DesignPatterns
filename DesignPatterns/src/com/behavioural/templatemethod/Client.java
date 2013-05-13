package com.behavioural.templatemethod;

public class Client {
	public static void main(String[] args) {
		AbstractMethod abstractMethodA = new ConcreteMethodA();
		AbstractMethod abstractMethodB = new ConcreteMethodB();
		abstractMethodA.templateMethod();
		//B重写了父类的钩子方法 打印method1和method2
		abstractMethodB.templateMethod();
	}
}
