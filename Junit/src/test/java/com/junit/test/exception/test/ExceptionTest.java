package com.junit.test.exception.test;

import org.junit.Test;

import com.junit.test.Junit.Calculator;

import junit.framework.Assert;

public class ExceptionTest {
	private int firstValue = 10;
	private int secondValue = 0;

	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		Calculator calculator = Calculator.getInstance();
		Assert.assertEquals(0, calculator.divide(firstValue, secondValue));
	}
}
