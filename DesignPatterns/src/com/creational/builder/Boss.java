/**    
 * @{#} Boss.java Create on 2013-5-7 下午4:13:44    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.builder;

/**    
 * @{#} Boss.java Create on 2013-5-7 下午4:13:44    
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
public class Boss {

	public static void main(String[] args) {
		//先招了个屌丝程序员，对于屌丝级别的程序原来说,应该会做很多事情，实现IProject里面所有的接口方法
		Programmer programmer = new Programmer();
		//招一个项目经理
		ProgrammerManager manager = new ProgrammerManager();
		//让项目经理管理屌丝程序员，完成任务!
		boolean isFinish = manager.management(programmer);
		if(isFinish){
			//项目完成后,由程序员给源码给老板
			programmer.getProject();
		}
	}

}
