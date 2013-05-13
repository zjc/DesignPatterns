
package com.structure.flyweight;


public class CharacterB extends Character {

	// Constructor
	public CharacterB() {
		this.symbol = 'B';
		this.height = 120;
		this.width = 130;
		this.ascent = 50;
		this.descent = 0;
	}

	public void Display(int pointSize) {
		this.pointSize = pointSize;
		System.out.println(this.symbol + " (pointsize " + this.pointSize + ")");
	}

}
