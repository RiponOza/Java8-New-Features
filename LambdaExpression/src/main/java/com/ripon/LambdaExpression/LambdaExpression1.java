package com.ripon.LambdaExpression;

public class LambdaExpression1 {

	public static void main(String[] args) {

		// transaction1 object creation
		Transaction1 transection = new Transaction1() { // anonymious inner class

			@Override
			public void withdraw(int amount) {
				System.out.println(amount + "rs is withdrawn...");
			}
		};

		transection.withdraw(2300);
	
		// transaction2 object creation
		Transaction2 transaction2 = new Transaction2() {
			
			@Override
			public void deposit(int amount) {
				System.out.println(amount+"rs is deposited...");
			}
		};
		
		transaction2.deposit(3450);
	
	
	}

}
