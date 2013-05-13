package com.creational.prototype.lower;

import java.util.Date;

public class Userinfo implements Cloneable{

	private String name;
	private int age;
	private Date birthDate;
	private Usertype type;
	public Userinfo(String name,int age){
		this.name = name;
		this.age = age;
		birthDate = new Date();
		type = new Usertype();
	}
	
	@Override
	public String toString() {
		return "name:"+name+"\n age:"+age+"\n birthdate:"+birthDate+"\n usertype:"+type.toString();
	}

	@Override
	public Object clone()  {
		Userinfo userinfo = null;
		try{
			userinfo = (Userinfo)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return userinfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Usertype getType() {
		return type;
	}
	public void setType(Usertype type) {
		this.type = type;
	}
	
	
	
}
