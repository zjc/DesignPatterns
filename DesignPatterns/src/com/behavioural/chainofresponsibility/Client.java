package com.behavioural.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
	    // 创建指责链的所有节点  
        AbstractHandler handler00 = new Handler00();  
        AbstractHandler handler01 = new Handler01();  
        AbstractHandler handler02 = new Handler02();  
 
        // 进行链的组装，即头尾相连，一层套一层  
        handler00.setNextHandler(handler01);  
        handler01.setNextHandler(handler02);  
 
        // 创建请求并提交到指责链中进行处理  
        AbstractRequest request00 = new Request00("请求-01");  
        AbstractRequest request01 = new Request01("请求-02");  
        AbstractRequest request02 = new Request02("请求-03");  
          
        // 每次提交都是从链头开始遍历  
        handler00.handleRequest(request00);  
        handler00.handleRequest(request01);  
        handler00.handleRequest(request02);
	}
}
