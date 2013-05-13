/**    
 * @{#} Client.java Create on 2013-5-7 下午12:01:07    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */    
package com.creational.factorymethod;

/**    
 * @{#} Client.java Create on 2013-5-7 下午12:01:07    
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
public class Client {
    public static void main(String[] args) {
		AnimalFactory dogFactory = new DogFactory();
		IAnimal dog = dogFactory.getAnimal();
		dog.eat();
		
		AnimalFactory sheepFactory = new SheepFactory();
		IAnimal sheep  = sheepFactory.getAnimal();
		sheep.eat();
	}
}
