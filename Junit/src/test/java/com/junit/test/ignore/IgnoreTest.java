package com.junit.test.ignore;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.junit.test.Junit.Calculator;

import junit.framework.Assert;

@Ignore
public class IgnoreTest {
	private int firstValue =10;
	private int secondValue = 10;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}

	// execute after class
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}

	// execute before test
	@Before
	public void before() {
		firstValue = 10;
		System.out.println("in before");
	}

	// execute after test
	@After
	public void after() {
		System.out.println("in after");
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

}
