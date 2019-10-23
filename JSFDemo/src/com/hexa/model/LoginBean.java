package com.hexa.model;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="lb")
public class LoginBean {

	private String un;

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}
	
}
