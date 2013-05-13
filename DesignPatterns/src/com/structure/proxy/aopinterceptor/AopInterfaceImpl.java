/**    
 * @{#} AopInterfaceImpl.java Create on 2013-5-8 上午10:16:58    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.structure.proxy.aopinterceptor;

/**    
 * @{#} AopInterfaceImpl.java Create on 2013-5-8 上午10:16:58    
 *    
 * class desc:   
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public class AopInterfaceImpl implements IAopInterface{


	@Override
	public void before(Object obj) {
		System.out.println("调用前触发");
	}

	@Override
	public void end(Object obj) {
		System.out.println("调用后触发");
	}

}
