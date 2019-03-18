package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private UserListDeleteCompleteDAO uDAO = new UserListDeleteCompleteDAO();
	private ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();
	private String message;

	public String execute() throws SQLException{
		int aa = uDAO.createUserHistoryDelete();
		if(aa>0){
			userList = null;
			setMessage("人間は消えた。");
		}else if(aa == 0){
			setMessage("人間は消えない。");
		}
		String result = SUCCESS;
		return result;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<UserListDTO> getUserList() {
		return this.userList;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
