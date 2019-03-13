package com.internousdev.ecsite.dto;

public class UserCreateCompleteDTO {
	private String loginUserId;
	private String loginUserPassword;
	private String userName;

	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
	public String getLoginUserPassword() {
		return loginUserPassword;
	}
	public void setLoginUserPassword(String loginUserPassword) {
		this.loginUserPassword = loginUserPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


}
