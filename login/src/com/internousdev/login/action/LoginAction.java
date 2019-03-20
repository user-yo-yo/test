package com.internousdev.login.action;

import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String name;
	private String password;
//	↑.jspで定義した名前にする。

	public String execute()throws SQLException{
//					↑executeはメソッド名。

		String ret = ERROR;
//		↑メソッドの戻り値を「ret」と定義し、初期値としてERRORを代入。

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

		dto=dao.select(name,password);
//		↑JSPから送られたnameとpasswordを引数とし、LoginDAOクラスのselectメソッドを呼び出す。
//		　その後にDAOで取得した結果をLodinDTOに代入している。
		if(name.equals(dto.getName())){
			if(password.equals(dto.getPassword())){
				ret = SUCCESS;
//		↑if文が満たされた場合のみ「ret」がSUCCESSに書き換えられる。
			}
		}
		return ret;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	setterを定義することでJSPでユーザーが入力したnameとpasswordの値がそれぞれのフィールド変数に格納される。
//	次画面に値を引き渡すときにgetterが必要になる。
//	後々の不具合を防ぐために両方書いておくという策。

}
