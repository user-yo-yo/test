package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	ItemCreateCompleteDAO iCCDAO = new ItemCreateCompleteDAO();

	public String execute() throws SQLException{
		iCCDAO.createItem(session.get("itemName").toString(),
				session.get("itemPrice").toString(),
				session.get("itemStock").toString());

		String result = SUCCESS;
		return result;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

}