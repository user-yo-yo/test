package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private ItemListDeleteCompleteDAO iLDCDAO = new ItemListDeleteCompleteDAO();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException{
		if(!session.containsKey("item")){
			return ERROR;
		}
		if(deleteFlg==null){
			String item_info_transaction = session.get("item").toString();
			createItemList = ItemListDeleteCompleteDAO.getCreateItemListYo(item_info_transaction);
		}else if(deleteFlg.equals("1")){
			delete();
		}
		String result = SUCCESS;
		return result;
	}
	public void delete() throws SQLException{
		String item_info_transaction = session.get("item").toString();

		int res = iLDCDAO.createItemHistoryDelete(item_info_transaction);

		if(res>0){
			createItemList = null;
			setMessage("商品を削除しました。");
		}else if(res==0){
			setMessage("商品を削除出来ませんでした。");
		}
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public ArrayList<ItemListDeleteCompleteDAO> getCreateItemList(){
		return this.createItemList;
	}
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}
}
