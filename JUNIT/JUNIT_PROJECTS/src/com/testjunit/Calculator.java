package com.testjunit;

public class Calculator {

	public static int add(int number1,int number2) {
		return number1 + number2;
	}
	public static int sub(int number1,int number2) {
		return number1 - number2;
	}
	public static int mul(int number1,int number2) {
		return number1 * number2;
	}
	public static double div(double number1,double number2) {
		if(number2==0)  {
			throw new IllegalArgumentException("Number can not be divisible by 0!");
		}
		return number1 / number2;
	}
	
	
	
	
}
