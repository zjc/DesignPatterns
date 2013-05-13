/**    
 * @{#} NormalVoteState.java Create on 2013-5-10 下午3:04:00    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.state1;

/**    
 * @{#} NormalVoteState.java Create on 2013-5-10 下午3:04:00    
 *    
 * class desc:   正常投票
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public class RepeatVoteState implements IVoteState{

	@Override
	public void vote(String uuid, String voteItem, VoteManager manager) {
		 //重复投票，暂时不做处理
        System.out.println("请不要重复投票");
	}



}
