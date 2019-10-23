package com.hexa.spring.Springdemo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Sony implements Camera {

	public void getPixel() {
		System.out.println("50 MP");

	}

}
