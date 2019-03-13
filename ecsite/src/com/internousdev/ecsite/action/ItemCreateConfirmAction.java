package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware {
	private String addItem;
	private String itemZaiko;
	private String itemKakaku;
	public Map<String,Object> session;
	private String errorMessage;

	public String execute(){
		String result = SUCCESS;

		if(!(addItem.equals(""))
			&& !(itemZaiko.equals(""))
			&& !(itemKakaku.equals(""))){
				session.put("addItem",addItem);
				session.put("itemZaiko",itemZaiko);
				session.put("itemKakaku",itemKakaku);
		}else{
				setErrorMessage("未入力の項目があります。");
				result = ERROR;
		}
		return result;
	}

	public String getAddItem() {
		return addItem;
	}

	public void setAddItem(String addItem) {
		this.addItem = addItem;
	}

	public String getItemZaiko() {
		return itemZaiko;
	}

	public void setItemZaiko(String itemZaiko) {
		this.itemZaiko = itemZaiko;
	}

	public String getItemKakaku() {
		return itemKakaku;
	}

	public void setItemKakaku(String itemKakaku) {
		this.itemKakaku = itemKakaku;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}
}
