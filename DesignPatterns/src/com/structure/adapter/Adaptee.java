package com.structure.adapter;
/**
 * @{#} Adaptee.java Create on 2013-5-8 上午12:09:34    
 * class desc: Adaptee 需要被适配的类
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:morelap@morelap.com">Morelap</a>   
 */
public class Adaptee {
	//需要适配重写的方法
	public void specificRequst() {
		System.out.println("Adaptee's SpecificRequst");
	}
}
