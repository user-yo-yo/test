package com.internousdev.ecsite2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemDAO;
import com.internousdev.ecsite2.dao.LoginDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.internousdev.ecsite2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private LoginDAO liDAO = new LoginDAO();
	private LoginDTO liDTO = new LoginDTO();
	private BuyItemDAO biDAO = new BuyItemDAO();

	public String execute(){
		String rs = ERROR;
		liDTO = liDAO.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUser",liDTO);

//	入力値からユーザー情報の検索を実行。
//	成功した場合、「商品情報」が必要になるためそれを取得する。
		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			rs = SUCCESS;
			BuyItemDTO biDTO = biDAO.getBuyItemInfo();

			session.put("login_user_id",liDTO.getLoginId());
			session.put("id",biDTO.getId());
			session.put("buyItem_name",biDTO.getItemName());
			session.put("buyItem_price",biDTO.getItemPrice());

			return rs;
		}
		return rs;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
