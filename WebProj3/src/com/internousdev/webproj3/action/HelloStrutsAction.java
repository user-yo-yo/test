package com.internousdev.webproj3.action;

import com.internousdev.webproj3.dao.HSDAO;
import com.internousdev.webproj3.dto.HSDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport{
	private String result;

	public String execute(){
		String ret = ERROR;
		HSDAO dao = new HSDAO();
		HSDTO dto = new HSDTO();

		dto = dao.select();

		System.out.println(dto.getResult());
		result = dto.getResult();

		if(result.equals("MySQLと接続できます。")){
			ret = SUCCESS;
		}else{
			ret = ERROR;
		}
		return ret;
	}
	public String getResult(){
		return result;
	}
	public void setResult(String result){
		this.result = result;
	}
}
