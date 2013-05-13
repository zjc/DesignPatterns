/**    
 * @{#} Client.java Create on 2013-5-8 上午10:01:16    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.structure.proxy.aopinterceptor;

public class Client {

	public static void main(String[] args) {
		ProxyObject po = new ProxyObject();
		// 实现的拦截处理对象
		po.setAop(new AopInterfaceImpl());
		po.setMethodName("acc");// 指定要拦截的函数

		ISubInterface si = (ISubInterface) po.factory(new SubInterfaceImpl());
		// 因为add方法不是我们指定的拦截函数,AopInterfaceImp是不会被执行
		si.add("tt", "dd");
		// acc是我们指定的拦截方法,所以调用acc的前后会先执行AopInterfaceImp
		// 对象的两个方法
		si.acc("tt");
	}

}
