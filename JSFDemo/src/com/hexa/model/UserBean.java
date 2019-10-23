package com.hexa.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


public class UserBean {
	private String un;
	private String ps;
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	
}
