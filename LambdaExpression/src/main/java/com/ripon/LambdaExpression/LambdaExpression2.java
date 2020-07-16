package com.ripon.LambdaExpression;

public class LambdaExpression2 {

	public static void main(String[] args) {

		// transaction1 object creation
		Transaction1 transaction1 = (int amount) -> { // Lambda Expression
			System.out.println(amount + "rs is withdrawn...");
		};

		transaction1.withdraw(5425);

		// transaction1 object creation
		Transaction2 transaction2 = (int amount) -> { // Lambda Expression
			System.out.println(amount + "rs is deposited...");
		};
		
		transaction2.deposit(6000);
	}
}