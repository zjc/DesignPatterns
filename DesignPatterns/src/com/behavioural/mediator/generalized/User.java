  
package com.behavioural.mediator.generalized;

//员工类
public class User {

	private String userId;
	private String userName;
	
	public boolean dimission(){
		  DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
          return mediator.deleteUser(userId);
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
