package com.ripon.example;

/* This example uses lambda expression to create runnable object */

public class Example02 {

	public static void main(String[] args) {

		// Runnable is instantiated using lambda expression
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread running.....");
			}
		};

		Thread t = new Thread(r);
		t.start(); // Child thread started.

		// This code is run by main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread running.....");
		}

	}

}
