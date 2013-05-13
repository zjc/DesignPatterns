package com.creational.prototype.lower;

public class Client {
	private Userinfo user = new Userinfo("张三",24);
	public static void main(String[] args) {
		Client client = new Client();
		client.change();
	}
	
	private void change(){
		Userinfo user2 = (Userinfo)user.clone();
		//数据完全相同
		System.out.println("user toString:"+user.toString());
		System.out.println("user2 toString:"+user2.toString());
		//打印false 说明不是一个对象
		System.out.println("is equals:"+(user2 == user));
		//打印true 说明是同一个对象
		System.out.println("type is equals:"+(user2.getType() == user.getType()));
	}
}
