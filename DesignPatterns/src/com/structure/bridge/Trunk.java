package com.structure.bridge;


public class Trunk extends Vehicle{

	public Trunk(IEngine engine) {
		super(engine);
	}

	@Override
	public void setEngine() {
		System.out.println("卡车设置引擎马力:");
		getEngine().setEngine();
	}

}
