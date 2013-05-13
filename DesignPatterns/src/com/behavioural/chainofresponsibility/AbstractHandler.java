package com.behavioural.chainofresponsibility;

public abstract class AbstractHandler {
	private AbstractHandler nextHandler;
	public final void handleRequest(AbstractRequest request){
		//若该请求与当前的处理级别相同，则由自己处理
		if(this.getHandlerLevel() == request.getRequestLevel()){
			this.handle(request);
		}else{
			//如果当前处理者不能胜任，则传递至职责链的下一个节点
			if(this.nextHandler != null){
				System.out.println("当前 处理者-0"+this.getHandlerLevel()+"不足以处理请求-0"+request.getRequestLevel());
				this.nextHandler.handleRequest(request);
			}else{
				System.out.println("职责链上的所有处理者都不能胜任该请求！！");
			}
		}
	}
	public void setNextHandler(AbstractHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	//定义当前处理者的级别
	public abstract int getHandlerLevel();
	//定义处理
	public abstract void handle(AbstractRequest request);
}
