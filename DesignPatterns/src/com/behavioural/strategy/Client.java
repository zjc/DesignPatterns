/**    
 * @{#} Client.java Create on 2013-5-10 下午4:10:46    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.strategy;

/**
 * @{# Client.java Create on 2013-5-10 下午4:10:46
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
public class Client {

	/**
	 * method desc：
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 策略讲究的使用某一个算法，所有算法都平等可相互替代，
		// 状态讲究的是改变，属于对象内部的状态，状态的改变会导致行为的改变!
		IStrategy strategyA = new ConcreteStrategyA();
		Context ctx = new Context(strategyA);
		ctx.contextInterface();
	}

}
