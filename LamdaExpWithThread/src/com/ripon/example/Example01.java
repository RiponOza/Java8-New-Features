package com.ripon.example;

/* This example doesn't use lambda expression to create runnable object. */

class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child thread running.....");
		}
	}
}


public class Example01 {

	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable(); // Runnable object created.
		Thread t = new Thread(r); // Thread object created.
		t.start(); // Child thread started here
		
		for(int i=0;i<10;i++) { // This is run by main thread.
			System.out.println("Main thread running.....");
		}
	}

}
