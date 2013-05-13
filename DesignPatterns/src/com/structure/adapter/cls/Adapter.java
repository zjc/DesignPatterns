package com.structure.adapter.cls;

import com.structure.adapter.Adaptee;
import com.structure.adapter.ITarget;
/**
 * @{#} Adapter.java Create on 2013-5-8 上午12:15:13    
 * class desc:通过继承方式 实现类适配
 * <p>Copyright: Copyright(c) 2013 </p> 
 * <p>Company: morelap</p>
 * @Version 1.0
 * @Author <a href="mailto:morelap@morelap.com">Morelap</a>   
 */
public class Adapter extends Adaptee implements ITarget{
	@Override
	public void request() {
		 System.out.println("Adapter's Request"); 
         super.specificRequst(); 
	}

}
