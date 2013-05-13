/**    
 * @{#} Client.java Create on 2013-5-8 上午10:01:16    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.structure.proxy;

import com.structure.proxy.dynamic.ProxyObject;

/**    
 * @{#} Client.java Create on 2013-5-8 上午10:01:16    
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
public class Client {

	public static void main(String[] args) {
		ISellInterface inter = new RedWinProxy();
		inter.sell();
	}

}
