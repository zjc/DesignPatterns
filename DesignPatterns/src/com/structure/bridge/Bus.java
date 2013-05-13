package com.structure.bridge;


public class Bus extends Vehicle{

	public Bus(IEngine engine) {
		super(engine);
	}

	@Override
	public void setEngine() {
		System.out.println("设置bus 引擎马力:");
		getEngine().setEngine();
	}

}
