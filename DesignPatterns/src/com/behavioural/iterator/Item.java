package com.behavioural.iterator;
/**
 * 
 * @{#} Item.java Create on 2013-5-9 下午11:42:56    
 *    
 * class desc:具体的子对象
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:morelap@morelap.com">Morelap</a>   
 */
public class Item {
	private int itemId;
	private String name;
	public Item(int itemId,String name){
		this.itemId = itemId;
		this.name = name;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
