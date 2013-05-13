/**    
 * @{#} ModuleFacade.java Create on 2013-5-8 下午3:24:43    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.structure.facade;

/**
 * @{# ModuleFacade.java Create on 2013-5-8 下午3:24:43
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
public class ModuleFacade {

	ModuleA a = new ModuleA();
	ModuleB b = new ModuleB();
	ModuleC c = new ModuleC();

	/**
	 * 下面这些是A、B、C模块对子系统外部提供的方法
	 * 选择性的实现
	 */
	public void a1() {
		a.a1();
	}

	public void b1() {
		b.b1();
	}

	public void c1() {
		c.c1();
	}

}
