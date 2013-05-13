    
package com.behavioural.mediator.generalized;
//部门类
public class Dep {
	  private String depId;
      private String depName;
      
      public boolean deleteDep(){
    	  DepUserMediatorImpl  mediator = DepUserMediatorImpl.getInstance();
          return mediator.deleteDep(depId);
      }

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}
      
      

}
