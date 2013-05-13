package com.structure.proxy;

public class RedWinFactory implements ISellInterface{
	@Override
	public Object sell() {
		 System.out.println("真实主题角色RedWineFactory 被调用了");  
		return new Object();
	}

}
