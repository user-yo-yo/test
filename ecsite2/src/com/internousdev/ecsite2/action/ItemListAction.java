package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.ItemListDAO;
import com.internousdev.ecsite2.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private ItemListDAO iLDAO = new ItemListDAO();
	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException{
		if(!session.containsKey("itemName")){
			return ERROR;
		}
		if(deleteFlg == null){
			String item_name = session.get("itemName").toString();
			String item_price = session.get("itemPrice").toString();
			String item_stock = session.get("itemStock").toString();

			itemList = iLDAO.getItemList(item_name,item_price,item_stock);
		}else if(deleteFlg.equals("1")){
			delete();
		}
		String result = SUCCESS;
		return result;
	}
	public void delete()throws SQLException{
		String item_name = session.get("itemName").toString();
		String item_price = session.get("itemPrice").toString();
		String item_stock = session.get("itemStock").toString();

		int res = iLDAO.itemListDelete(item_name,item_price,item_stock);

		if(res>0){
			itemList = null;
			setMessage("All Delete");
		}else if(res==0){
			setMessage("削除失敗");
		}
	}
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public ArrayList<ItemListDTO> getMyPageList(){
		return this.itemList;
	}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}