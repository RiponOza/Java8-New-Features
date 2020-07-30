package com.ripon.example;

public class SquareRootInterfaceImpl {

	public static void main(String[] args) {
		
		SquareRootInterface sq = no -> (no*no);

		System.out.println(sq.sqrt(5));
		System.out.println(sq.sqrt(15));
		System.out.println(sq.sqrt(25));
		System.out.println(sq.sqrt(75));
		
		
	}

}
