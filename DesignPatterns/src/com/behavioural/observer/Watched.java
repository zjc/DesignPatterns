/**    
 * @{#} Watched.java Create on 2013-3-19 下午6:24:59    
 *    
 * Copyright (c) 2012 by mark_zhu.    
 *
 *    
 * @author <a href="mailto:zjc198805@gmail.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.behavioural.observer;

import java.util.Observable;

/**
 * @{# Watched.java Create on 2013-3-19 下午6:24:59
 * 
 *     类功能说明:被观察对象,也就是被监视对象
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
public class Watched extends Observable{
	private String data = "";

	public String retrieveData() {
		return data;
	}

	public void changeData(String data) {
		if (!this.data.equals(data)) {
			this.data = data;
			setChanged();
		}
		notifyObservers();
	}

}
