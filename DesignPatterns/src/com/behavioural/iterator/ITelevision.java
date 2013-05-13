package com.behavioural.iterator;

import java.util.Vector;

/**
 * 
 * @{#} ITelevision.java Create on 2013-5-9 下午11:52:08    
 *    
 * class desc:   所有电视都提供 检索频道功能(迭代频道)
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:morelap@morelap.com">Morelap</a>   
 *  
 *
 */
public interface ITelevision {
	public IIterator createIterator();//创建迭代功能
	public Vector<Item> getChannel();//获取频道集合,有集合才能迭代
}
