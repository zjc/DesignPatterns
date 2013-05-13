/**    
 * @{#} IProject.java Create on 2013-5-7 下午4:07:19    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.builder;

/**    
 * @{#} IProject.java Create on 2013-5-7 下午4:07:19    
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
public interface IProject {
	public void analysisNeeds();//分析项目需求
    public void dbDesign();//数据库设计
    public void codeProgramming();//编写code
    public void proTest();//项目测试
}
