package com.hexaware.association;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class City {
	
	@Id
	private int cpin;
	private String cname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "state_city", 
	joinColumns = {@JoinColumn(name = "cref")},
	inverseJoinColumns = {@JoinColumn(name = "sref")})
	private State state;
	
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getCpin() {
		return cpin;
	}
	public void setCpin(int cpin) {
		this.cpin = cpin;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

}
