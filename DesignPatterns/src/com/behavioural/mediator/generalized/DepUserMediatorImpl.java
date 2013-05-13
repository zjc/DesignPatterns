package com.behavioural.mediator.generalized;

import java.util.ArrayList;
import java.util.Collection;

//实现部门和人员的交互 终结者实现
public class DepUserMediatorImpl {

	private DepUserMediatorImpl() {
		initTestData();
	}

	private static final DepUserMediatorImpl instance = new DepUserMediatorImpl();

	public static final DepUserMediatorImpl getInstance() {
		return instance;
	}

	// 用于记录部门和人员之间的关系
	private final Collection<DepUserModel> depUserCol = new ArrayList<DepUserModel>();

	void initTestData() {
	       DepUserModel du1 = new DepUserModel();
           du1.setDepUserId("du1");
           du1.setDepId("d1");
           du1.setUserId("u1");
           depUserCol.add(du1);

           DepUserModel du2 = new DepUserModel();
           du2.setDepUserId("du2");
           du2.setDepId("d1");
           du2.setUserId("u2");
           depUserCol.add(du2);

           DepUserModel du3 = new DepUserModel();
           du3.setDepUserId("du3");
           du3.setDepId("d2");
           du3.setUserId("u3");
           depUserCol.add(du3);

           DepUserModel du4 = new DepUserModel();
           du4.setDepUserId("du4");
           du4.setDepId("d2");
           du4.setUserId("u4");
           depUserCol.add(du4);

           DepUserModel du5 = new DepUserModel();
           du5.setDepUserId("du5");
           du5.setDepId("d2");
           du5.setUserId("u1");
           depUserCol.add(du5);
	}

	public boolean deleteUser(String userId) {
		Collection<DepUserModel> tempCol = new ArrayList<DepUserModel>();
		for (DepUserModel du : depUserCol) {
			if (du.getUserId().equals(userId)) {
				tempCol.add(du);
			}
		}
		return depUserCol.removeAll(tempCol);
	}

	public boolean deleteDep(String depId) {
		Collection<DepUserModel> tempCol = new ArrayList<DepUserModel>();
		for (DepUserModel du : depUserCol) {
			if (du.getDepId().equals(depId)) {
				tempCol.add(du);
			}
		}
		return depUserCol.removeAll(tempCol);
	}

	/**
	 * 显示部门中的所有人员
	 * 
	 * @param dep
	 *            部门对象
	 */
	public void showDepUser(Dep dep) {
		for (DepUserModel du : depUserCol) {
			if (du.getDepId().equals(dep.getDepId())) {
				System.out.println("部门编号=" + dep.getDepId() + "下面拥有人员，其编号是："
						+ du.getUserId());
			}
		}
	}

	/**
	 * 显示人员所在的部门
	 * 
	 * @param user
	 *            人员对象
	 */
	public void showUserDeps(User user) {
		for (DepUserModel du : depUserCol) {
			if (du.getUserId().equals(user.getUserId())) {
				System.out.println("人员编号=" + user.getUserId() + "属于部门编号是："
						+ du.getDepId());
			}
		}
	}

}
