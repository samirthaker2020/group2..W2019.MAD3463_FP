package com.lambton.order.user.user;

import java.util.ArrayList;

public class Administrator extends User {

	private String adminName;

	private String email;
	
	ArrayList<Administrator> adminList=new ArrayList<Administrator>();

	public Administrator() {

	}

	public Administrator(String adminName, String email) {
		
		this.adminName = adminName;
		this.email = email;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public ArrayList<Administrator> getAdminList() {
		return adminList;
	}

	public void setAdminList(ArrayList<Administrator> adminList) {
		this.adminList = adminList;
	}

	@Override
	boolean verifyLogin(String userId,String password) {
		// TODO Auto-generated method stub
		String user=null;
		if (adminList.isEmpty()) {
			return false;
		} else {
			for (User a : adminList) {
				if (a.getUserId() == userId && a.getPassword() == password) {
					return true;
				}
			}
			}
		return false;
	}

	//public boolean updatecatalog()
}
