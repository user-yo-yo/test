package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.MyPageDAO;
import com.internousdev.ecsite2.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private MyPageDAO mPDAO = new MyPageDAO();
	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException{
		if(!session.containsKey("id")){
			return ERROR;
		}
		if (deleteFlg == null){
			String item_transaction_id = session.get("id").toString();
			String user_name_id = session.get("login_user_id").toString();
			myPageList = mPDAO.getMyPageUserInfo(item_transaction_id,user_name_id);
		}else if(deleteFlg.equals("1")){
			delete();
		}
		String result = SUCCESS;
		return result;
	}
	public void delete()throws SQLException{
		String item_transaction_id = session.get("id").toString();
		String user_name_id = session.get("login_user_id").toString();

		int res = mPDAO.buyItemHistoryDelete(item_transaction_id,user_name_id);

		if(res>0){
			myPageList = null;
			setMessage("All Delete");
		}else if(res == 0){
			setMessage("Couldn't Delete...");
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
	public ArrayList<MyPageDTO> getMyPageList(){
		return this.myPageList;
	}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}