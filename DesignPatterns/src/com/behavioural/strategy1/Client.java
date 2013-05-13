package com.behavioural.strategy1;

public class Client {

	/**
	 * method desc：
	 * @param args
	 */
	public static void main(String[] args) {
		//高级会员 8折优惠
		IMemberStrategy strategy = new SuperMemberStrategy();
		Price price = new Price(strategy);
		System.out.println("super:"+price.quote(100));;
		
		//9折优惠
		strategy = new MiddleMemberStrategy();
		price = new Price(strategy);
		System.out.println("middle:"+price.quote(100));
		
		//不享受折扣
		strategy = new PrimaryMemberStrategy();
		price = new Price(strategy);
		System.out.println("primary:"+price.quote(100));
	}

}
