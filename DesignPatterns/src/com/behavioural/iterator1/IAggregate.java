package com.behavioural.iterator1;
/**
 * 
 * @{#} Aggregate.java Create on 2013-5-10 上午12:32:33    
 *    
 * class desc: 集合对象抽象类  
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:morelap@morelap.com">Morelap</a>   
 */
public interface IAggregate<E> {
	public IIterator<E> createIterator();
}
