package com.hexa.spring.Springdemo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

@Autowired
private MobileOS mob;
@Autowired
@Qualifier("nikon")
private Camera cam;
	
	public MobileOS getMob() {
	return mob;
}

public void setMob(MobileOS mob) {
	this.mob = mob;
}

	

	public Camera getCam() {
	return cam;
}

public void setCam(Camera cam) {
	this.cam = cam;
}

	public void Mobile() {
		System.out.println("S10");
		mob.and();
		cam.getPixel();
		
	}
}
