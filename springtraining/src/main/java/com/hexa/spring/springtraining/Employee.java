package com.hexa.spring.springtraining;

import java.security.KeyStore.Entry;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

public class Employee {
	private Map<Integer, String> edetails;

	public Map<Integer, String> getEdetails() {
		return edetails;
	}

	public void setEdetails(Map<Integer, String> edetails) {
		this.edetails = edetails;
	}
	public void empDetails() {
		System.out.println("Emp id     Emp name");
		for (java.util.Map.Entry<Integer, String> e: edetails.entrySet()) {
			System.out.println(e.getKey() + "            " + e.getValue());
		}
	}

}
