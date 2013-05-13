package com.structure.bridge;

public class Client {

	public static void main(String[] args) {
		IEngine engine1500 = new Engine1500CC();
		IEngine engine2200 = new Engine2200CC();
		
		Vehicle bus = new Bus(engine1500);
		bus.setEngine();
		
		Vehicle bus2 = new Bus(engine2200);
		bus2.setEngine();
		
		Vehicle trunk = new Trunk(engine1500);
		trunk.setEngine();
		
		Vehicle trunk2 = new Trunk(engine2200);
		trunk2.setEngine();
	}

}
