/**    
 * @{#} Client.java Create on 2013-5-10 下午2:28:07    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.state;

/**    
 * @{#} Client.java Create on 2013-5-10 下午2:28:07    
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

	/**
	 * method desc：
	 * @param args
	 */
	public static void main(String[] args) {
		 //创建环境
        Context context = new Context();
		//创建状态
        IState state = new ConcreteStateB();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
        
        state = new ConcreteStateA();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
	}

}
