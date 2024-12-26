package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void test() {

		Calculation c = new Calculation();
		int result = c.add(20, 40);
		assertEquals(60, result);//Expected Result, Actual Result
		//Assert.assertEquals(60, result);//Expected Result, Actual Result
	}

}
