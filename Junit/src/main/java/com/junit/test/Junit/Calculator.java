package com.junit.test.Junit;

public class Calculator {

	/**
	 * This is a basic calculator class which will operate only on integer type
	 * data
	 * 
	 */

	private Calculator() {

	}

	public static Calculator getInstance() {
		return new Calculator();
	}

	public int add(int input1, int input2) {
		return input1 + input2;
	}

	public int subtract(int input1, int input2) {
		return input1 - input2;
	}

	public int multiply(int input1, int input2) {
		return input1 * input2;
	}

	public int divide(int input1, int input2) {
		return input1 / input2;
	}
}
