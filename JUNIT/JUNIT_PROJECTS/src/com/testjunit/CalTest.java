package com.testjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void calTest() {
		
		assertEquals("error in add()", 3 , Calculator.add(1,2));
		assertEquals("error in add()", -3 , Calculator.add(-1,-2));
		assertEquals("error in add()", 9 , Calculator.add(9,0));
	}

	
	public void calcTestAddFail() {
		assertEquals("error in add()",0,Calculator.add(1, 2));
	}
	
	public void calcTestSubPass() {
		assertEquals("error in sub()", 4 , Calculator.add(1,2));
		assertEquals("error in sub()", -4 , Calculator.add(-1,-2));
		assertEquals("error in sub()", 0 , Calculator.add(2,1));
	}
	public void calcTestSubfail() {
		
		assertEquals("error in add()",0,Calculator.add(2, 1));
	}
	
}

