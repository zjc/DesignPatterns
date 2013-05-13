/**    
 * @{#} Context.java Create on 2013-5-10 下午6:01:59    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.interpreter;

import java.util.HashMap;
import java.util.Map;

/**    
 * @{#} Context.java Create on 2013-5-10 下午6:01:59    
 *    
 * class desc:   
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public class Context {

	private Map<Variable,Boolean> map = new HashMap<Variable,Boolean>();
	public void assign(Variable var,boolean value){
		map.put(var, new Boolean(value));
	}
	
	public boolean lookup(Variable var) throws IllegalArgumentException{
		Boolean value = map.get(var);
		if(value == null){
			throw new IllegalArgumentException();
		}
		return value.booleanValue();
	}

}
