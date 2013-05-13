package com.behavioural.iterator;

import java.util.Vector;

/**
 * 
 * @{#} TCLTV.java Create on 2013-5-9 下午11:55:36    
 *    
 * class desc:  TCL 电视对象 
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:morelap@morelap.com">Morelap</a>   
 *  
 *
 */
public class TCLTV implements ITelevision{
	private Vector<Item> channel;//频道集合
	public TCLTV(){
		channel = new Vector<Item>();
		for(int i=1;i<=12;i++){//中央 12个频道
			channel.add(new Item(i,"CCAV"+i));
		}
	}
	@Override
	public IIterator createIterator() {
		return new Controller(channel);
	}

	@Override
	public Vector<Item> getChannel() {
		return channel;
	}

}
