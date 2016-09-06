package com.junit.test.fixtures;

import com.junit.test.Junit.Calculator;

import org.junit.Assert;
import org.junit.Test;

public class FixturesTest {
	private int firstValue = 10;
	private int secondValue = 20;
	@Test
	public void testAdd1(){
		Calculator calc = Calculator.getInstance();
		int result = calc.add(firstValue, secondValue);
		Assert.assertTrue(result == 30);
	}
	
	@Test
	public void testAdd2(){
		firstValue = 30;
		secondValue = 40;
		Calculator calc = Calculator.getInstance();
		int result = calc.add(firstValue, secondValue);
		Assert.assertTrue(result == 70);
	}
	
	
	@Test
	public void testAdd3(){
		firstValue = 100;
		secondValue = 40;
		Calculator calc = Calculator.getInstance();
		int result = calc.add(firstValue, secondValue);
		Assert.assertTrue(result == 140);
	}
	
	@Test
	public void testAdd4(){
		firstValue = 30;
		secondValue = 50;
		Calculator calc = Calculator.getInstance();
		int result = calc.add(firstValue, secondValue);
		Assert.assertTrue(result == 80);
	}
}
