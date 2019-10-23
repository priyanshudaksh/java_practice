package com.hexaware.association;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class State {
	
	@Id
	private int sid;
	private String sname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "state_city", 
	joinColumns = {@JoinColumn(name = "sref")},
	inverseJoinColumns = {@JoinColumn(name = "cref")})
	private List<City> city;
	
	public List<City> getCity() {
		return city;
	}
	public void setCity(List<City> city) {
		this.city = city;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
