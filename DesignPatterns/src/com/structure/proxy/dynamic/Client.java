/**    
 * @{#} Client.java Create on 2013-5-8 上午10:01:16    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.structure.proxy.dynamic;

import com.structure.proxy.ISellInterface;
import com.structure.proxy.RedWinFactory;
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
		//动态代理
		ISellInterface si = (ISellInterface) ProxyObject.factory(new RedWinFactory());
		si.sell();
	}

}
