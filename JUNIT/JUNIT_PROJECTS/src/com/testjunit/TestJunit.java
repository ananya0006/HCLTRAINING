package com.testjunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

	@Test
	public void testAdd() {
		String str = "Junit is working fine";
		//here assertequals is a method which asserts that the expected value is equal to actual value (parameters are expected value  and actual value to check and test)
		assertEquals("Junit is working fine", str);
		
	}
}
