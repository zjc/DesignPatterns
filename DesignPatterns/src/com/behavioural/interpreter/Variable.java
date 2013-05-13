package com.behavioural.interpreter;
/**
 * 
 * @{#} Variable.java Create on 2013-5-11 下午11:10:08    
 *    
 * class desc:一个variable对象代表一个有名变量
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:morelap@morelap.com">Morelap</a>   
 *  
 *
 */
public class Variable extends IExpression{

	private String name;
	public Variable(String name){
		this.name = name;
	}
	@Override
	public boolean interpret(Context ctx) {
		return ctx.lookup(this);
	}

	@Override
	public boolean equals(Object obj) {
		if(null != obj && obj instanceof Variable){
			return this.name == ((Variable)obj).name;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return name;
	}

}
