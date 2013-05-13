package com.structure.flyweight;

import java.util.Hashtable;

//flyweight factory
public class CharacterFactory {

	private Hashtable characters = new Hashtable();

	public Character GetCharacter(char key) {
		// Uses "lazy initialization"
		Character character = (Character) characters.get(key);
		if (character == null) {
			switch (key) {
			case 'A':
				character = new CharacterA();
				break;
			case 'B':
				character = new CharacterB();
				break;
			case 'C':
				character = new CharacterC();
				break;
			case 'D':
				character = new CharacterD();
				break;
			//etc...
			}
			characters.put(key, character);
		}
		return character;
	}

}
