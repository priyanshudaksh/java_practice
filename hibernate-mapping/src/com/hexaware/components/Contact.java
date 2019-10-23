package com.hexaware.components;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Contact {
	private long phone;
	@Column(length = 20)
	private String emailId;
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}
