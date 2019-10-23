package com.hexa.spring.springtraining;


public class Venue {
	private int vid;
	private String location;
	
	public Venue(int vid, String location) {
		super();
		this.vid = vid;
		this.location = location;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Venue [vid=" + vid + ", location=" + location +  "]";
	}
	
}
