    
package com.behavioural.visitor;


public class ElementA extends Element{

	
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void operation() {
		System.out.println("ElementA operation");
	}

	

}
