/**    
 * @{#} Singleton.java Create on 2013-5-7 上午11:08:20    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.creational.singleton;

/**
 * @{# Singleton.java Create on 2013-5-7 上午11:08:20
 * 
 *     class desc:
 * 
 *     <p>
 *     Copyright: Copyright(c) 2013
 *     </p>
 *     <p>
 *     Company: morelap
 *     </p>
 * @Version 1.0
 * @Author <a href="mailto:mark@morelap.com">mark_zhu</a>
 * 
 * 
 */
public class Singleton {
	/**
	 * 私有构造函数
	 */
	private Singleton() {
	}
	/**
	 * 懒汉式是延时加载
	 * 懒汉式如果在创建实例对象时不加上synchronized则会导致对对象的访问不是线程安全的
	 */
//	private static Singleton instance;
//	public static synchronized Singleton getInstance() {
//		if (instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
	/**
	 * 饿汉式是线程安全的,在类创建的同时就已经创建好一个静态的对象供系统使用,以后不在改变 
	 */
	private static Singleton instance = new Singleton();
	public static Singleton getInstance(){
		return instance;
	}

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if (s1 == s2)
			System.out.println("s1 is the same instance with s2");
		else
			System.out.println("s1 is not the same instance with s2");
	}
}
