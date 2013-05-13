/**    
 * @{#} Caretaker.java Create on 2013-2-26 ����11:22:13    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.memento.multistate;

import java.util.HashMap;
import java.util.Map;

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
	private Map<String, Memento> memMap = new HashMap<String, Memento>();  
    public Memento getMemento(String index){  
        return memMap.get(index);  
    }  
      
    public void setMemento(String index, Memento memento){  
        this.memMap.put(index, memento);  
    }  
}
