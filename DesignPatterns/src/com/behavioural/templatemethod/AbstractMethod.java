package com.behavioural.templatemethod;

public abstract class AbstractMethod {
	public abstract void method1();

	public abstract void method2();

	public final void templateMethod() {
		if(hookMethod()){
			method1();
		}else{
			method1();
			method2();
		}
	}

	// 钩子方法,protected权限可被子类覆盖，默认为返回true
	protected boolean hookMethod() {
		return true;
	}
}
