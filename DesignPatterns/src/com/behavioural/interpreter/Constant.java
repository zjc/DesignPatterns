package com.behavioural.interpreter;

import java.beans.Expression;
/**
 * 
 * @{#} Constant.java Create on 2013-5-11 下午11:01:25    
 *    
 * class desc:   代表一个boolean的常量
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:morelap@morelap.com">Morelap</a>   
 *  
 *
 */
public class Constant extends IExpression{
	private boolean value;
	public Constant(boolean value){
		this.value = value;
	}
	@Override
	public boolean interpret(Context ctx) {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Constant){
			return this.value == ((Constant)obj).value;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
