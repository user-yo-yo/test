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
			String item_info_transaction = session.get("itemName").toString();
			itemList = iLDAO.getItemList(item_info_transaction);
		}else if(deleteFlg.equals("1")){
			delete();
		}

	}
}