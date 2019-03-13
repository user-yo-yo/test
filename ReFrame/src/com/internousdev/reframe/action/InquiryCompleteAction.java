package com.internousdev.reframe.action;

import com.opensymphony.xwork2.ActionSupport;

public class InquiryCompleteAction extends ActionSupport{
	private String name;
	private String qtype;
	private String body;
	public String getName() {
		return name;
	}
	public String getQtype() {
		return qtype;
	}
	public String getBody() {
		return body;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQtype(String qtype) {
		this.qtype = qtype;
	}
	public void setBody(String body) {
		this.body = body;
	}

}
