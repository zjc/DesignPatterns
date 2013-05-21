  
package com.behavioural.visitor;


public class ElementC extends Element{

	
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}


	@Override
	public void operation() {
		System.out.println("ElementC operation");
	}

}
