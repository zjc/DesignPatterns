/**    
 * @{#} Remote.java Create on 2013-4-2 下午12:54:16    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.java.callback;

/**    
 * @{#} Remote.java Create on 2013-4-2 下午12:54:16    
 *    
 * class desc:   
 *
 * <p>Copyright: Copyright(c) 2010 </p> 
 * <p>Company: skysation</p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 *  
 * 
 */
public class Remote {

	 public void executeMessage(String msg,CallBack callBack){
		 try {
			Thread.sleep(3000);//处理message耗时工作
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(msg);
		System.out.println("I have executed the message by local");
		 //这相当于同学执行完之后打电话给你 
		callBack.execute(new String[]{"Nice to meet you~!"}); 
	 }  

}
