/**    
 * @{#} Watcher.java Create on 2013-3-19 下午6:27:29    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @{# Watcher.java Create on 2013-3-19 下午6:27:29
 * 
 *     类功能说明: 观察者对象叫做Watcher
 * 
 *     <p>
 *     Copyright: Copyright(c) 2010
 *     </p>
 *     <p>
 *     Company: skysation
 *     </p>
 * @Version 1.0
 * @Author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>
 * 
 * 
 */
public class Watcher  implements Observer{

	public Watcher(Watched w) {
		w.addObserver(this);
	}

	public void update(Observable ob, Object arg) {
		System.out.println("Data has been changed to: '"
				+ ((Watched) ob).retrieveData() + "'");
	}

}
