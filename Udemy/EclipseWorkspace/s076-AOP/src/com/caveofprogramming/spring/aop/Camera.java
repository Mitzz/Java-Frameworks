package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component("camera")
public class Camera implements PhotoSnapper, Machine, ICamera{
	
	public Camera() {
		System.out.println("Hello from camera constructor");
	}

	@Override
	@Deprecated
	public void snap(){
		System.out.println("SNAP!");
		
		//throw new Exception("bye bye!");
	}
	
	@Override
	public void snap(int exposure){
		System.out.println("SNAP! Exposure: " + exposure);
	}
	
	@Override
	public void snap(double exposure){
		System.out.println("SNAP! Exposure: " + exposure);
	}
	
	@Override
	public void snap(int exposure, double aperture) {
		System.out.println("SNAP! Exposure: " + exposure + " aperture: " + aperture);
		
	}
	
	@Override
	public String snap(String name){
		System.out.println("SNAP! Name: " + name);
		return name;
	}
	
	@Override
	public void snapNighttime(){
		System.out.println("SNAP! Night mode.");
	}
	
	public void snapCar(Car car){
		System.out.println("Snapping Car!");
	}

	
}
