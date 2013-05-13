/**    
 * @{#} Singletion1.java Create on 2013-5-7 上午11:29:00    
 *    
 * Copyright (c) 2013 by mark_zhu. 
 * @author <a href="mailto:mark@morelap.com">mark_zhu</a>   
 * @version 1.0    
 */
package com.creational.singleton;

/**
 * @{# Singletion1.java Create on 2013-5-7 上午11:29:00
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
public class Singleton1 {
	static boolean instance_flag = false; // true if 1 instance

	public Singleton1() {
		if (instance_flag)
			throw new SingletonException("Only one instance allowed");
		else
			instance_flag = true; // set flag for 1 instance
	}

	class SingletonException extends RuntimeException {
		public SingletonException(String s) {
			super(s);
		}
	}

	static public void main(String argv[]) {
		Singleton1 s1, s2;
		System.out.println("Creating one instance");
		try {
			s1 = new Singleton1();
		} catch (SingletonException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Creating two instance");
		try {
			s2 = new Singleton1();
		} catch (SingletonException e) {
			System.out.println(e.getMessage());
		}
	}
}
