/**    
 * @{#} Context.java Create on 2013-5-10 下午2:26:09    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.state;

/**    
 * @{#} Context.java Create on 2013-5-10 下午2:26:09    
 *    
 * class desc:   上下文对象，持有状态类的引用
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public class Context {

	private IState state;
	public void setState(IState state){
		this.state = state;
	}
	
	/**
     * 用户感兴趣的接口方法
     */
    public void request(String sampleParameter) {
        //转调state来处理
        state.handle(sampleParameter);
    }
	

}
