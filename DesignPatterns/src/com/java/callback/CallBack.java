/**    
 * @{#} CallBack.java Create on 2013-4-2 下午12:53:07    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.java.callback;

/**    
 * @{#} CallBack.java Create on 2013-4-2 下午12:53:07    
 *    
 * class desc:   callback
 *
 * <p>Copyright: Copyright(c) 2010 </p> 
 * <p>Company: skysation</p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 *  
 * 
 */
public interface CallBack {
	/**  
     * 执行回调方法  
     * @param objects   将处理后的结果作为参数返回给回调方法  
     */    
    public void execute(Object... objects ); 
}
