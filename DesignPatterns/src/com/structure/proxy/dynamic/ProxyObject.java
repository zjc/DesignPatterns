package com.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.structure.proxy.ISellInterface;
import com.structure.proxy.RedWinFactory;

/**
 * 
 * @{# ProxyObject.java Create on 2013-5-8 上午10:00:55
 * 
 *     class desc: 动态代理
 *     InvocationHandler接口就是一种拦截机制,当系统中有了代理对象以后,对原对象(真实主题)方法的调用,
 *     都会转由InvocationHandler接口来处理
 *     ,并把方法信息以参数的形式传递给invoke方法,这样,我们就可以在invoke方法中拦截原对象的调用
 *     ,并通过反射机制来动态调用原对象的方法.这好象也是spring aop编程的基础
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
	private Object proxy_obj;

	public ProxyObject(Object obj) {
		this.proxy_obj = obj;
	}

	public static Object factory(Object obj) {
		Class cls = obj.getClass();
		ClassLoader loader = cls.getClassLoader();
		Class<?>[] interfaces = cls.getInterfaces();
		InvocationHandler h = new ProxyObject(obj);
		// 通过Proxy类的newProxyInstance方法来返回代理对象
		return Proxy.newProxyInstance(loader, interfaces, h);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("函数调用前被拦截了:   " + method);
		if (args != null) {
			// 打印参数列表
			System.out.println("方法有  " + args.length + "    个参数");
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
		Object mo = method.invoke(proxy_obj, args);
		System.out.println("函数调用后进行处理 :   " + method);
		return mo;
	}

//	public static void main(String[] args) {
//		ISellInterface si = (ISellInterface) factory(new RedWinFactory());
//		si.sell();
//	}

}
