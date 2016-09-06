package com.junit.test.from.file;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.junit.test.Junit.Calculator;

import junit.framework.Assert;
import junit.framework.TestCase;

public class JunitTestFromFile extends TestCase {

	private int firstValue;
	private int secondValue;
	@Before
	protected void setUp(){
		System.out.println("inside before!!!");
		firstValue = 10;
		secondValue = 10;
	}
	
	
	@Test
	public void testAdd(){
		Calculator calculator = Calculator.getInstance();
		Assert.assertEquals(20, calculator.add(firstValue, secondValue));
		
	}
	
	
	@Test
	public void testMultiply(){
		Calculator calculator = Calculator.getInstance();
		Assert.assertEquals(100, calculator.multiply(firstValue, secondValue));
	}
	
	@After
	protected void tearDown(){
		firstValue = 0;
		secondValue = 0;
		System.out.println("Inside after!!!");
	}
}
