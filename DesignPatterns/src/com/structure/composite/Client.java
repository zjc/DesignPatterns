package com.structure.composite;

public class Client {

	public static void main(String[] args) {
		// 构造一个文件目录
		IRoot root1 = new Folder("c:\\");
		IRoot root2 = new Folder("d:\\");
		IRoot win = new Folder("windows");
		IRoot sys = new Folder("system");
		IRoot hw = new File("HelloWorld.java");
		root1.addFile(win);
		root1.addFile(sys);
		win.addFile(hw);

		root1.display();
		root2.display();
	}

}
