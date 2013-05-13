/**    
 * @{#} Programmer.java Create on 2013-5-7 下午4:08:51    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.builder;

/**    
 * @{#} Programmer.java Create on 2013-5-7 下午4:08:51    
 *    
 * class desc:   对于小公司苦逼的程序员来说要做N多事情
 *
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 *  
 * 
 */
public class Programmer implements IProject{

	@Override
	public void analysisNeeds() {
		System.out.println("分析需求");
	}

	@Override
	public void dbDesign() {
		System.out.println("设计数据库");
	}

	@Override
	public void codeProgramming() {
		System.out.println("编码");
	}

	@Override
	public void proTest() {
		System.out.println("测试");
	}
	
	public Project getProject(){
		return new Project();
	}

}
