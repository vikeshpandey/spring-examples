package io.github.vikeshpandey;

public class Operation {
	public void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not valid age");
		} else {
			System.out.println("You are eligible to drive");
		}
	}

}
