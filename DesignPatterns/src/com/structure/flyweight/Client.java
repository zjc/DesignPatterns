package com.structure.flyweight;

public class Client {

	public static void main(String[] args) {
		   // Build a document with text
	      String document = "AADDBBCB";
	      char[] chars = document.toCharArray();

	      CharacterFactory f = new CharacterFactory();

	      // extrinsic state
	      int pointSize = 10;

	      // For each character use a flyweight object
	      for(char c : chars){
	        pointSize++;
	        Character character = f.GetCharacter(c);
	        character.Display(pointSize);
	        System.out.println(c+"-->"+character.toString().hashCode());
	      }
	}
}
