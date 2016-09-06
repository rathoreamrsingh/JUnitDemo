package com.junit.setup.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitSetUpTest {

	@Test
	public void testSetup(){
		String str = "test";
		assertEquals("test", str);
	}
}
