package com.hexa.model;

import javax.annotation.ManagedBean;

@javax.faces.bean.ManagedBean(name="lb")
public class LoginBean {
	String un;
	int num = 0;
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void incremenr() {
		
		num=num++;
		
	}
}
