package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
//import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private ItemListDeleteCompleteDAO iDDAO = new ItemListDeleteCompleteDAO();
	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
//	private String deleteFlg;
	private String message;

//	public String execute() throws SQLException {
//		if (deleteFlg == null) {
//			String item_name = session.get("itemName").toString();
//			String item_price = session.get("itemKakaku").toString();
//			String item_stock = session.get("itemStock").toString();
//			itemList = iDDAO.getItemListInfo(item_name, item_price, item_stock);
//		} else
//			if (deleteFlg != null) {
//			delete();
//		}else if(deleteFlg == null) {
//			String item_name = session.get("itemName").toString();
//			String item_price = session.get("itemKakaku").toString();
//			String item_stock = session.get("itemStock").toString();
//			itemList = iDDAO.getCreateItemHistoryDelete(item_name, item_price, item_stock);
//		}
//		String result = SUCCESS;
//		return result;
//	}

	public String execute() throws SQLException {
//		String item_name = session.get("itemName").toString();
//		String item_price = session.get("itemKakaku").toString();
//		String item_stock = session.get("itemStock").toString();

		int res = iDDAO.createItemHistoryDelete();

		if (res > 0) {
			itemList = null;
			setMessage("商品情報を正しく削除しました。");
		} else if (res == 0) {
			setMessage("商品情報の削除に失敗しました。");
		}
		String result = SUCCESS;
		return result;
	}

//	public void setDeleteFlg(String deleteFlg) {
//		this.deleteFlg = deleteFlg;
//	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<ItemListDTO> getItemList() {
		return this.itemList;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}