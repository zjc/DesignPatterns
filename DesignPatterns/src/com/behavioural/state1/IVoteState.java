/**    
 * @{#} IVoteState.java Create on 2013-5-10 下午3:01:06    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.state1;

/**    
 * @{#} IVoteState.java Create on 2013-5-10 下午3:01:06    
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
public interface IVoteState {
	/**
	 * 
	 * method desc：
	 * @param uuid：用户唯一索引
	 * @param voteItem:投票选项
	 * @param manager: 投票管理上下文对象，用来在实现状态对应的功能处理的时候，
     *                         可以回调上下文的数据
	 */
	public void vote(String uuid,String voteItem,VoteManager manager);
}
