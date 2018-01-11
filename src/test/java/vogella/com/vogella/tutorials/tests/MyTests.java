package com.vogella.tutorials.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.vogella.tutorials.MyClass;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class MyTests {

	private MyClass tester;
	
	@Before
	public void initMock() {
		System.out.println("Processing initMock() method ...");
		tester = new MyClass();
	}
	
	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		// assert statements
		assertEquals(0, tester.multiply(10, 0));
		assertEquals(0, tester.multiply(0, 10));
		assertEquals(0, tester.multiply(0, 0));
	}
	
	@Test(expected = OutOfMemoryError.class)
	public void inputParamsOutOfRangeOfAnIntegerShouldTriggerAnException() {
		int result = tester.multiply(Integer.MAX_VALUE + 1, 2);
		System.out.println( "Result of " + Integer.MAX_VALUE + " * 2: " + result);
	}
}
