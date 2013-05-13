/**    
 * @{#} CharacterA.java Create on 2013-5-13 下午2:04:59    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.structure.flyweight;

/**
 * @{# CharacterA.java Create on 2013-5-13 下午2:04:59
 * 
 *     class desc:
 * 
 *     <p>
 *     Copyright: Copyright(c) 2013
 *     </p>
 *     <p>
 *     Company: morelap
 *     </p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>
 * 
 * 
 */
public class CharacterA extends Character {

	// Constructor
	public CharacterA() {
		this.symbol = 'A';
		this.height = 100;
		this.width = 120;
		this.ascent = 70;
		this.descent = 0;
	}

	public void Display(int pointSize) {
		this.pointSize = pointSize;
		System.out.println(this.symbol + " (pointsize " + this.pointSize + ")");
	}

}
