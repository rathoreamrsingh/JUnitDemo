package com.junit.test.before.after;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junit.test.Junit.Calculator;

import junit.framework.Assert;

public class BeforeAfterTest {
	private static int firstValue;
	private static int secondValue;
	

	@Before
	public void setUp() {
		System.out.println("inside before!!!");
		firstValue = 10;
		secondValue = 10;
	}

	@Test
	public void testAdd() {
		Calculator calculator = Calculator.getInstance();
		Assert.assertEquals(20, calculator.add(firstValue, secondValue));

	}

	@Test
	public void testMultiply() {
		Calculator calculator = Calculator.getInstance();
		Assert.assertEquals(100, calculator.multiply(firstValue, secondValue));
	}

	@After
	public void tearDown() {
		firstValue = 0;
		secondValue = 0;
		System.out.println("Inside after!!!");
	}
}
