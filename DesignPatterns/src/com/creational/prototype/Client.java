package com.creational.prototype;

public class Client {

	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		for (int i = 0; i < 10; i++) {
			// 掉用父类中的clone方法,强转成子类类型
			ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
			clonecp.show();
		}
	}

}
