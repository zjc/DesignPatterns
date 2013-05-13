/**    
 * @{#} Caretaker.java Create on 2013-2-26 上午9:24:02    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.memento.singlestate;

/**    
 * @{#} Caretaker.java Create on 2013-2-26 上午9:24:02    
 *    
 * 类功能说明:   管理角色
 *
 * <p>Copyright: Copyright(c) 2010 </p> 
 * <p>Company: skysation</p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 *  
 * 
 */
public class Caretaker {
	private Memento memento;  
    public Memento getMemento(){  
        return memento;  
    }  
    public void setMemento(Memento memento){  
        this.memento = memento;  
    }  
}
