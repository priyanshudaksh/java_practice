package com.hexaware.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profileId;
	private String name;
	private String password;
	private LocalDate dob;
	public Profile(int profileId, String name, String password, LocalDate dob) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.password = password;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", name=" + name + ", password=" + password + ", dob=" + dob + "]";
	}
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
}
