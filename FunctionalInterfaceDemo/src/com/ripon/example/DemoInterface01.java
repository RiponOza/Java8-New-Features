package com.ripon.example;

@FunctionalInterface
public interface DemoInterface01 {

	public void m1(); //abstract method
	
	default public void m2() {} //public default method
	
	default void m3() {} //public default method
	
	public static void m4() {} //static method
	
}
