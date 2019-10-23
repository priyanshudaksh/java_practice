package com.hexa.spring.Springdemo2;

import org.springframework.stereotype.Component;

@Component
public class Nikon implements Camera {

	public void getPixel() {
		System.out.println("30 MP");

	}

}
