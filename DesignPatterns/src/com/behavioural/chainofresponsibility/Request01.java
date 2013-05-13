package com.behavioural.chainofresponsibility;

public class Request01 extends AbstractRequest{

	public Request01(String content) {
		super(content);
	}
	
	@Override
	public int getRequestLevel() {
		return ILevels.LEVEL_1;
	}

}
