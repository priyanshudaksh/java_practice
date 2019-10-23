package com.hexa.spring.springdemo3;

import org.springframework.stereotype.Component;
import javax.annotation.*;
@Component
public class Employee {
	private int eid;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Before call");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Ready to clean");
	}
	
}
