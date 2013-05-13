/**    
 * @{#} Mediator.java Create on 2013-3-4 ����2:54:46    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.mediator.normal;

/**
 * 
 * @{#} Mediator.java Create on 2013-3-4 下午3:00:32    
 *    
 * 类功能说明:   中介者接口
 *
 * <p>Copyright: Copyright(c) 2010 </p> 
 * <p>Company: skysation</p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 *  
 *
 */
public interface IMediator {
	/**
	 * 
	 * 方法描述：同事对象在自身改变的时候通知中介者的方法
	 * 让中介者去负责响应的与其他同事对象的交互
	 * @param colleague 同事对象自身，好让中介者对象通过对象实例
	 */
	public void changed(Colleague colleague);

	

}
