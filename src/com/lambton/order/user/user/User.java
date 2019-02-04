package com.lambton.order.user.user;

public abstract class User {

	private String userId;

	private String password;

	private String loginStatus;

	public User() {

	}

	
	public User(String userId, String password, String loginStatus) {
		super();
		this.userId = userId;
		this.password = password;
		this.loginStatus = loginStatus;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}



	abstract boolean verifyLogin(String userId,String password); 

}
