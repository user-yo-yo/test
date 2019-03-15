package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String addItem;
	private int itemZaiko;
	private int itemKakaku;

	public String execute(){
		String result = SUCCESS;

		session.put("addItem",addItem);
		Integer.parseInt(session.put("itemZaiko",itemZaiko).toString());
		Integer.parseInt(session.put("itemKakaku",itemKakaku).toString());

		return result;
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