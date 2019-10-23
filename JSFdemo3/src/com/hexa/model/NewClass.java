package com.hexa.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name="uf")
public class NewClass {
	private String firstname;
	private String lastname;
	private String CountryName;
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public List<String> countryList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("Australia");
		list.add("Russia");
		list.add("Afganistan");
		list.add("Pakistan");
		return list;
	}
	public void save() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Hello" + firstname));
	}
}
