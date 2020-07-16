package com.ripon.DefaultMethodInInterface;

public interface DemoInterface {

	public void m1();
	
	public void m2();
	
	// example of default method in interface
	default public void m3(){
		System.out.println("Original m3()");
	}
	
}
