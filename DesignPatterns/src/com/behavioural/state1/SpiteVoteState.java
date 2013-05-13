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
public class SpiteVoteState implements IVoteState{

	@Override
	public void vote(String uuid, String voteItem, VoteManager manager) {
		// 恶意投票，取消用户的投票资格，并取消投票记录
        String str = manager.getMapVote().get(uuid);
        if(str != null){
        	manager.getMapVote().remove(uuid);
        }
        System.out.println("你有恶意刷屏行为，取消投票资格");
	}



}
