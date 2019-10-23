package com.hexa.spring.SpringJDBC;

public class Product {
	private int ProId;
	private String ProName;
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int proId, String proName) {
		super();
		ProId = proId;
		ProName = proName;
	}
	public int getProId() {
		return ProId;
	}
	public void setProId(int proId) {
		ProId = proId;
	}
	public String getProName() {
		return ProName;
	}
	public void setProName(String proName) {
		ProName = proName;
	}
	
	

}
