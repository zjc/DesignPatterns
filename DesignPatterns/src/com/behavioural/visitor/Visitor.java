/**    
 * @{#} Visitor.java Create on 2013-5-21 上午10:32:06    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.visitor;

/**    
 * @{#} Visitor.java Create on 2013-5-21 上午10:32:06    
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
public class Visitor implements IVisitor{

	@Override
	public void visit(Element element) {
		System.out.println("element operation begin");
		element.operation();
		System.out.println("element operation end");
	}

}
