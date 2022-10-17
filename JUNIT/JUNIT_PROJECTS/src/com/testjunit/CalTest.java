package com.testjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void calTestAddPass() {
		
		assertEquals("error in add()", 3 , Calculator.add(1,2));
		assertEquals("error in add()", -3 , Calculator.add(-1,-2));
		assertEquals("error in add()", 9 , Calculator.add(9,0));
	}

	
	public void calcTestAddFail() {
		assertEquals("error in add()",0,Calculator.add(1, 2));
	}
	@Test
	public void calcTestSubPass() {
		assertEquals("error in sub()", -1 , Calculator.sub(1,2));
		assertEquals("error in sub()", -1 , Calculator.sub(-2,-1));
		assertEquals("error in sub()", 1 , Calculator.sub(2,1));
	}
	public void calcTestSubfail() {
		
		assertEquals("error in sub()",0,Calculator.sub(2, 1));
	}
	
}

