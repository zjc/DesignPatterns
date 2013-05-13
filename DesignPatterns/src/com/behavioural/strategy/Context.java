/**    
 * @{#} Context.java Create on 2013-5-10 下午3:54:13    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.strategy;

/**    
 * @{#} Context.java Create on 2013-5-10 下午3:54:13    
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
public class Context {

	//持有一个具体策略的对象
    private IStrategy strategy;
    /**
     * 构造函数，传入一个具体策略对象
     * @param strategy    具体策略对象
     */
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }
    /**
     * 策略方法
     */
    public void contextInterface(){
        strategy.strategyInterface();
    }

}
