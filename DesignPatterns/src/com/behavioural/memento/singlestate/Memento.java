package com.behavioural.memento.singlestate;
/**
 * 
 * @{#} Memento.java Create on 2013-2-26 上午9:22:52    
 *    
 * 类功能说明:   备忘录
 *
 * <p>Copyright: Copyright(c) 2012 </p> 
 * <p>Company: skysation</p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 *  
 *
 */
public class Memento {
	private String state = "";  
    public Memento(String state){  
        this.state = state;  
    }  
    public String getState() {  
        return state;  
    }  
    public void setState(String state) {  
        this.state = state;  
    }  
}
