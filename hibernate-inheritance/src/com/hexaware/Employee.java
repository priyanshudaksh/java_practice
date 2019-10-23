package com.hexaware;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@DiscriminatorColumn(name = "desig", length = 15)
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

	@Id
	private int eid;
	
	
	@Column(length=15)
	private String name;


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
}
