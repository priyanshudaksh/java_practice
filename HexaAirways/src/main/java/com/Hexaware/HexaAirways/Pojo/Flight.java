package com.Hexaware.HexaAirways.Pojo;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="flight_details")
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fid;
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String fname;
	private String source;
	private String destination;
	private LocalDate doj;
	private LocalTime time;
	private double fare;
	private String cateogory;
	private int seats;
	
	
	
	public Flight(int fid, String fname, String source, String destination, LocalDate doj, LocalTime time, double fare,
			String cateogory, int seats) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.source = source;
		this.destination = destination;
		this.doj = doj;
		this.time = time;
		this.fare = fare;
		this.cateogory = cateogory;
		this.seats = seats;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getCateogory() {
		return cateogory;
	}
	public void setCateogory(String cateogory) {
		this.cateogory = cateogory;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
		
}
