package com.behavioural.memento.singlestate;
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
	private String state = "";  
    
    public String getState() {  
        return state;  
    }  
    public void setState(String state) {  
        this.state = state;  
    }  
    public Memento createMemento(){  
        return new Memento(this.state);  
    }  
    public void restoreMemento(Memento memento){  
        this.setState(memento.getState());  
    }  
}
