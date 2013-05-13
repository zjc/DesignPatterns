
package com.structure.flyweight;

public class CharacterC extends Character {

	// Constructor
	public CharacterC() {
		this.symbol = 'C';
		this.height = 80;
		this.width = 60;
		this.ascent = 50;
		this.descent = 0;
	}

	public void Display(int pointSize) {
		this.pointSize = pointSize;
		System.out.println(this.symbol + " (pointsize " + this.pointSize + ")");
	}

}
