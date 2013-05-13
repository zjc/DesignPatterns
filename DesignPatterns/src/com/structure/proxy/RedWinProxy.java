package com.structure.proxy;

public class RedWinProxy implements ISellInterface{
	//持有一个RedWineFactory对象的引用  
	private RedWinFactory factory = new RedWinFactory();
	@Override
	public Object sell() {
		Object obj = factory.sell();
		return obj;
	}

}
