
package com.structure.flyweight;


public class CharacterD extends Character {

	// Constructor
	public CharacterD() {
		this.symbol = 'D';
		this.height = 200;
		this.width = 220;
		this.ascent = 70;
		this.descent = 0;
	}

	public void Display(int pointSize) {
		this.pointSize = pointSize;
		System.out.println(this.symbol + " (pointsize " + this.pointSize + ")");
	}

}
