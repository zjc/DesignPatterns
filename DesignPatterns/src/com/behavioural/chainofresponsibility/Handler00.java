package com.behavioural.chainofresponsibility;

public class Handler00 extends AbstractHandler{

	@Override
	public int getHandlerLevel() {
		return ILevels.LEVEL_0;
	}

	@Override
	public void handle(AbstractRequest request) {
		System.out.println("处理者-0"+getHandlerLevel()+" 处理 0"+request.getRequestLevel()+"的请求! \n");
	}


}
