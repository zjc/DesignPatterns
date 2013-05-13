/**    
 * @{#} Client.java Create on 2013-5-10 下午3:12:09    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.state1;

/**    
 * @{#} Client.java Create on 2013-5-10 下午3:12:09    
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
		VoteManager manager = new VoteManager();
		for(int i=0;i<10;i++){
			//身份证号和投票的选项
			manager.vote("uuid", String.valueOf(i));
		}
	}

}
