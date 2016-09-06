package com.junit.test.timeout;

import org.junit.Test;

import com.junit.test.Junit.Calculator;

import junit.framework.Assert;

public class TimeoutTest {

	private int firstValue = 10;
	private int secondValue = 10;

	@Test(timeout = 1000)
	public void testAdd() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		Calculator calculator = Calculator.getInstance();
		Assert.assertEquals(20, calculator.add(firstValue, secondValue));

	}
}
