package com.creational.prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
import java.util.Date;

public class Userinfo implements Serializable, Cloneable {

	/**
	 * serialVersionUID：
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private Date birthDate;
	private Usertype type;

	public Userinfo(String name, int age) {
		this.name = name;
		this.age = age;
		birthDate = new Date();
		type = new Usertype();
	}

	@Override
	public String toString() {
		return "name:" + name + "\n age:" + age + "\n birthdate:" + birthDate
				+ "\n usertype:" + type.toString();
	}

	public Object deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);

		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);

		return (oi.readObject());

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
