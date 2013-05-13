package com.creational.prototype.lower;

public class Usertype {
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
