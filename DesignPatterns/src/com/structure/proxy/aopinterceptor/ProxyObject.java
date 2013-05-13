/**    
 * @{#} PeoxyObject.java Create on 2013-5-8 上午10:18:29    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.structure.proxy.aopinterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @{# PeoxyObject.java Create on 2013-5-8 上午10:18:29
 * 
 *     class desc:
 * 
 *     <p>
 *     Copyright: Copyright(c) 2013
 *     </p>
 *     <p>
 *     Company: morelap
 *     </p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>
 * 
 * 
 */
public class ProxyObject implements InvocationHandler {

	private IAopInterface aop;// 定义了切入时调用的方法
	private Object proxy_obj;
	private String methodName;// 指定需要切入的方法名

	public ProxyObject() {

	}

	public Object factory(Object obj) {
		this.proxy_obj = obj;
		Class cls = obj.getClass();
		return Proxy.newProxyInstance(cls.getClassLoader(),
				cls.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (this.aop == null)
			throw new NullPointerException("aop is null");
		if (method == null)
			throw new NullPointerException("method is null");
		Object obj;
		// 如果指定了要拦截方法名,并且调用的方法和指定的方法名相同,则进行拦截处理
		// 否则当正常方法处理 Important
		if (methodName != null && method.toString().indexOf(methodName) != -1) {
			aop.before(proxy_obj);// 指定方法调用前的处理
			obj = method.invoke(proxy_obj, args);
			aop.end(proxy_obj);// 指定方法调用后的处理
		} else {
			// 没有指定的方法,以正常方法调用
			obj = method.invoke(proxy_obj, args);
		}
		return obj;
	}

	public IAopInterface getAop() {
		return aop;
	}

	public void setAop(IAopInterface aop) {
		this.aop = aop;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

}
