package com.ripon.DefaultMethodInInterface;

public class DefaultMethodInInterface1 {

	public static void main(String[] args) {

		// DemoInterface object creation without overriding m3() 
		DemoInterface demo1 = new DemoInterface() {

			@Override
			public void m2() {
				System.out.println("demo-1 m2() method");
			}

			@Override
			public void m1() {
				System.out.println("demo-1 m1() method");

			}
		};
		
		demo1.m1();
		demo1.m2();
		demo1.m3();
		
		System.out.println();
		
		// DemoInterface object creation overriding m3() 
		DemoInterface demo2 = new DemoInterface() {
			
			@Override
			public void m2() {
				System.out.println("demo-2 m2() method");
				
			}
			
			@Override
			public void m1() {
				System.out.println("demo-2 m1() method");
				
			}
			
			@Override
			public void m3() {
				System.out.println("m3() overriden");
			}
		};
		
		demo2.m1();
		demo2.m2();
		demo2.m3();
		
	}

}
