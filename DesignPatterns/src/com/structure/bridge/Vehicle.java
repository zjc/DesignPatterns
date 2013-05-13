package com.structure.bridge;



public abstract class Vehicle {
	 private IEngine engine;//
	 public Vehicle(IEngine engine){
		 this.engine = engine;
	 }
	 public IEngine getEngine(){
	        return engine;
	 }
	 
	 public abstract void setEngine();
}
