package com.creational.prototype.deep;

import java.io.Serializable;

public class Usertype implements Cloneable, Serializable{
	/**
	 * serialVersionUID：
	 */
	private static final long serialVersionUID = 1L;
	private int typeId = 1;
	private String typeName = "管理员";
	
	
	@Override
	public String toString() {
		return "typeId:"+typeId+"\n typeName:"+typeName;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
}
