/**    
 * @{#} Tester.java Create on 2013-3-19 下午6:23:54    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.observer;

/**    
 * @{#} Tester.java Create on 2013-3-19 下午6:23:54    
 *    
 * 类功能说明:   
 *
 * <p>Copyright: Copyright(c) 2010 </p> 
 * <p>Company: skysation</p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 *  
 * 
 */
public class Tester {

	/**
	 * 方法描述：
	 * @param args
	 */
	public static void main(String[] args) {
		Watched watched = new Watched();//被观察的对象

		Watcher watcher = new Watcher(watched);//观察者

		watched.changeData("In C, we create bugs.");
		watched.changeData("In Java, we inherit bugs.");
		watched.changeData("In Java, we inherit bugs.");
		watched.changeData("In Visual Basic, we visualize bugs."); 
	}

}
