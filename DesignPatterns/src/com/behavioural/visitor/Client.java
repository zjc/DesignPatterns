   
package com.behavioural.visitor;


public class Client {
	public static void main(String[] args) {
		Element [] element = {new ElementA(),new ElementB(),new ElementC()};
		IVisitor visitor = new Visitor();
		for(int i=0;i<element.length;i++){
			element[i].accept(visitor);
		}
	}
}
