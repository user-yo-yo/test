package com.internousdev.login.dto;

public class LoginDTO {
	private int id;
	private String name;
	private String password;

//	↑テーブルから取得するデータに対応したフィールド変数を宣言している。

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
//	↑Actionクラスから呼び出され、nameフィールドの値をActionに送っている。
	public void setName(String name) {
		this.name = name;
	}
//	↑DAOから呼び出され、引数として受け取ったテーブルの値をnameフィールドに格納。
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
