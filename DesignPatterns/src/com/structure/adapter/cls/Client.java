package com.structure.adapter.cls;

import com.structure.adapter.ITarget;

public class Client {

	public static void main(String[] args) {
		ITarget target = new Adapter();
		target.request();
	}

}
