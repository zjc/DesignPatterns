/**    
 * @{#} Originator.java Create on 2013-2-26 ����11:16:56    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.memento.multistate;

/**
 * 
 * @{#} Originator.java Create on 2013-3-4 下午2:58:56    
 *    
 * 类功能说明:   发起人
 *
 * <p>Copyright: Copyright(c) 2010 </p> 
 * <p>Company: skysation</p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 *  
 *
 */
public class Originator {
	private String state1 = "";
	private String state2 = "";
	private String state3 = "";

	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	public String getState3() {
		return state3;
	}

	public void setState3(String state3) {
		this.state3 = state3;
	}

	public Memento createMemento() {
		return new Memento(BeanUtils.backupProp(this));
	}

	public void restoreMemento(Memento memento) {
		BeanUtils.restoreProp(this, memento.getStateMap());
	}

	public String toString() {
		return "state1=" + state1 + "state2=" + state2 + "state3=" + state3;
	}
}
