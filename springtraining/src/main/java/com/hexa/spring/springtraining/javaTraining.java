package com.hexa.spring.springtraining;

import java.util.Iterator;
import java.util.List;

public class javaTraining implements Training {
	private int tid;
	private String tname;
	private int Salary;
	private List<String> topics;
	private List<Venue> ven;
	
	public javaTraining(int tid, String tname, int salary, List<String> topics, List<Venue> ven) {
		super();
		this.tid = tid;
		this.tname = tname;
		Salary = salary;
		this.topics = topics;
		this.ven = ven;
	}

	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	public List<Venue> getVen() {
		return ven;
	}
	public void setVen(List<Venue> ven) {
		this.ven = ven;
	}
	
	public void training() {
		System.out.println("Java Training..........!!!!!  " );
		Iterator<String> itr = topics.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		}
		Iterator<Venue> itr1 = ven.iterator();
		while(itr.hasNext()) {
			
		System.out.println(itr1.next());
		}

	}
	@Override
	public String toString() {
		return "javaTraining [tid=" + tid + ", tname=" + tname + "  " + Salary + topics + ven +"]";
	}

}
