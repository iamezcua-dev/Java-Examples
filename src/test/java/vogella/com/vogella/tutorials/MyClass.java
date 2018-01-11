package com.vogella.tutorials;

public class MyClass {
	/**
	 * Returns the product of two numbers.
	 * @param number1 The first product factor.
	 * @param number2 The second product factor.
	 * @return The resulting product of the two numbers received as parameters.
	 */
	public int multiply( int number1, int number2 ) {
		System.out.println("Multiplication: " + number1 + " * " + number2);
		return number1 * number2;
	}
}
