package com.ripon.example;

public class Test {

	public static void main(String[] args) {

		/* First type of lambda expression... */

		DemoInterface03 inter = new DemoInterface03() {
			@Override
			public void show(int no) {
				System.out.println("Working.....");
				System.out.println("Your provided no is :: " + no + "\n");
			}
		};
		inter.show(100);

		/* Second type of lambda expression... */

		DemoInterface03 inter2 = (no) -> {
			System.out.println("Working again.....");
			System.out.println("Your provided no is :: " + no + "\n");
		};
		inter2.show(200);

		/* Third type of lambda expression... */

		DemoInterface03 inter3 = (no) -> System.out.println("Your provided no is :: " + no + "\n");
		inter3.show(500);
	}

}
