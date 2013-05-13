package com.structure.adapter.obj;

import com.structure.adapter.Adaptee;
import com.structure.adapter.ITarget;

public class Client {

	/**
	 * method desc：
	 * @param args
	 */
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		ITarget target = new Adapter(adaptee);
		target.request();
	}

}
