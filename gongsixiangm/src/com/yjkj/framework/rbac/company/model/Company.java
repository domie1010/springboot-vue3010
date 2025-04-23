package com.yjkj.framework.rbac.company.model;

import com.yjkj.framework.base.basemodel.BaseModel;


public class Company extends BaseModel{
	
	private String address;
	private String phone;
	private String email;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
