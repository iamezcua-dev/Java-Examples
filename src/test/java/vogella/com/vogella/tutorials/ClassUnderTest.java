package com.vogella.tutorials;

public class ClassUnderTest {
	public int multiply(int x, int y) {
		// The following is just an example
		if( x > 999 ) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x * y;
	}
}
