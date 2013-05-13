/**    
 * @{#} Client.java Create on 2013-3-4 下午3:19:30    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.behavioural.mediator.normal;

/**    
 * @{#} Client.java Create on 2013-3-4 下午3:19:30    
 *    
 * 类功能说明:   
 *
 * <p>Copyright: Copyright(c) 2010 </p> 
 * <p>Company: skysation</p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 *  
 * 
 */
public class Client {
	public static void main(String[] args) {
		 MainBoard mediator = new MainBoard();
		 CDDriver cd = new CDDriver(mediator);
         CPU cpu = new CPU(mediator);
         VideoCard vc = new VideoCard(mediator);
         SoundCard sc = new SoundCard(mediator);

         mediator.setCdDriver(cd);//将cd光驱插到主板上
         mediator.setCpu(cpu);//将cpu插到主板上
         mediator.setVideoCard(vc);//将video 显卡插到主板上
         mediator.setSoundCard(sc);//将声卡插到主板上

         
         cd.readCD();
	}
}
