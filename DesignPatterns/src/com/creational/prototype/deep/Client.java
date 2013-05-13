package com.creational.prototype.deep;

import java.io.IOException;
import java.io.OptionalDataException;

public class Client {
	private Userinfo user = new Userinfo("张三", 24);

	public static void main(String[] args) {
		try {
			Client client = new Client();
			client.change();
		} catch (Exception e) {

		}
	}

	private void change() throws IOException, OptionalDataException,
			ClassNotFoundException {
		Userinfo user2 = (Userinfo) user.deepClone();
		// 数据完全相同
		System.out.println("user toString:" + user.toString());
		System.out.println("user2 toString:" + user2.toString());
		// 打印false 说明不是一个对象
		System.out.println("is equals:" + (user2 == user));
		// 打印false 说明是不是同一个对象
		System.out.println("type is equals:"
				+ (user2.getType() == user.getType()));
	}
}
