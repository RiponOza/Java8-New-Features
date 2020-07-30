package com.ripon.example;

public class AddInterfaceImpl {

	public static void main(String[] args) {

		AddInterface ai = (a, b) -> System.out.println("Addition is :: " + (a + b) + "\n");

		ai.add(5, 10.11111f);
		ai.add(100, 200);
	}

}
