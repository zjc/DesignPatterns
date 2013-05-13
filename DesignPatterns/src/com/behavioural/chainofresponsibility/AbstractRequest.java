package com.behavioural.chainofresponsibility;

/**
 * @{# AbstractRequest.java Create on 2013-5-10 上午12:59:07 class desc: 抽象请求类
 *     <p>
 *     Copyright: Copyright(c) 2013
 *     </p>
 *     <p>
 *     Company: morelap
 *     </p>
 * @Version 1.0
 * @Author <a href="mailto:morelap@morelap.com">Morelap</a>
 */
public abstract class AbstractRequest {
	private String content;
	public AbstractRequest(String content){
		this.content = content;
	}
	
	public String getContent(){
		return content;
	}
	
	abstract int getRequestLevel();

}
