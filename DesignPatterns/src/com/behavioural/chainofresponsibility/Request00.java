package com.behavioural.chainofresponsibility;

public class Request00 extends AbstractRequest{

	public Request00(String content) {
		super(content);
	}
	
	@Override
	public int getRequestLevel() {
		return ILevels.LEVEL_0;
	}

}
