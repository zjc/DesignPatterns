package com.structure.proxy.aopinterceptor;

//切面接口,通过实现这个接口,我们可以对指定函数在调用前后进行处理
public interface IAopInterface {
	public void before(Object obj);//调用前的处理  
	public void end(Object obj);//调用后的处理
}
