/**    
 * @{#} ProgrammerManager.java Create on 2013-5-7 下午4:11:14    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.builder;

/**    
 * @{#} ProgrammerManager.java Create on 2013-5-7 下午4:11:14    
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
public class ProgrammerManager {
	
	public boolean management(IProject project){
		project.analysisNeeds();
		project.dbDesign();
		project.codeProgramming();
		project.proTest();
		return true;
	}
}
