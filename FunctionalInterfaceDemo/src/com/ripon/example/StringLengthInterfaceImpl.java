package com.ripon.example;

public class StringLengthInterfaceImpl {

	public static void main(String[] args) {

		/*
		 * lambda expression, anonymous function is used, strLen() method is overridden
		 * using lambda expression
		 */
		/* (), Type, return are not mandatory here */
		StringLengthInterface s = str -> str.length();

		System.out.println(s.strLen("Length"));
		System.out.println(s.strLen("Hello"));
		System.out.println(s.strLen("Hello World"));
		System.out.println(s.strLen("Hello World".replace(" ", "")));

	}

}
