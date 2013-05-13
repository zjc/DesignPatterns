/**    
 * @{#} Local.java Create on 2013-4-2 下午12:54:06    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.java.callback;

/**    
 * @{#} Local.java Create on 2013-4-2 下午12:54:06    
 *    
 * class desc:   
 *
 * <p>Copyright: Copyright(c) 2010 </p> 
 * <p>Company: skysation</p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 *  
 * 
 */
public class Local implements CallBack,Runnable{
	private Remote remote;
	private String message;
	public Local(Remote remote,String message){
		super();
		this.remote = remote;
		this.message = message;
	}
	
	public void sendMessage(){
		System.out.println(Thread.currentThread().getName());
		Thread thread = new Thread(this);
		thread.start();
		System.out.println("message has been send by local");
	}
	public static void main(String[] args) {
		Local local = new Local(new Remote(),"hello");
		local.sendMessage();
	}

	@Override
	public void run() {
		remote.executeMessage(message, this);
	}

	@Override
	public void execute(Object... objects) {
		System.out.println(objects[0]);
		System.out.println(Thread.currentThread().getName());
		Thread.interrupted();
	}

}
