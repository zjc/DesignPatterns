/**    
 * @{#} Memento.java Create on 2013-2-26 ����11:17:40    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.memento.multistate;

import java.util.Map;

/**
 * 
 * @{#} Memento.java Create on 2013-3-4 下午2:58:28    
 *    
 * 类功能说明:  备忘录 通过HashMap去管理 
 *
 * <p>Copyright: Copyright(c) 2010 </p> 
 * <p>Company: skysation</p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 *  
 *
 */
public class Memento {
	private Map<String, Object> stateMap;  
    
    public Memento(Map<String, Object> map){  
        this.stateMap = map;  
    }  
  
    public Map<String, Object> getStateMap() {  
        return stateMap;  
    }  
  
    public void setStateMap(Map<String, Object> stateMap) {  
        this.stateMap = stateMap;  
    }  

}
