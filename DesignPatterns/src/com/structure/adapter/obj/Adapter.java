package com.structure.adapter.obj;

import com.structure.adapter.Adaptee;
import com.structure.adapter.ITarget;

public class Adapter implements ITarget{
	public Adaptee adaptee;
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	@Override
	public void request() {
		 System.out.println("Adapter's Request"); 
		 adaptee.specificRequst();
	}
	
}
