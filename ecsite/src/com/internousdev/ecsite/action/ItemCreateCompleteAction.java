package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware {
	private String addItem;
	private int itemZaiko;
	private int itemKakaku;
	public Map<String, Object> session;
	private ItemCreateCompleteDAO itemCreateCompleteDAO = new ItemCreateCompleteDAO();

	public String execute() throws SQLException {
		itemCreateCompleteDAO.createItem(
				session.get("addItem").toString(),
				session.get("itemZaiko").toString(),
				session.get("itemKakaku").toString()
			);

		String result = SUCCESS;

		return result;
	}

	public String getAddItem() {
		return addItem;
	}

	public int getItemZaiko() {
		return itemZaiko;
	}

	public int getItemKakaku() {
		return itemKakaku;
	}

	public void setAddItem(String addItem) {
		this.addItem = addItem;
	}

	public void setItemZaiko(int itemZaiko) {
		this.itemZaiko = itemZaiko;
	}

	public void setItemKakaku(int itemKakaku) {
		this.itemKakaku = itemKakaku;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}