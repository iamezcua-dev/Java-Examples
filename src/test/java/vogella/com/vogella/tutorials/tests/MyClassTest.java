package com.vogella.tutorials.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.vogella.tutorials.ClassUnderTest;

public class MyClassTest {
	private ClassUnderTest tester;

	@Before
	public void setUp() {
		tester = new ClassUnderTest();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		tester.multiply(1000, 5);
	}
	
	@Test
	public void testMultiply() {
		assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	}

}
