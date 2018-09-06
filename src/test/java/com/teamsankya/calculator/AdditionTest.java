package com.teamsankya.calculator;

import org.junit.Test;

import junit.framework.TestCase;

public class AdditionTest {
	@Test
	public void addTest() {
		// Addition addition = new Addition();
		int sum = Addition.add(10, 20);
		TestCase.assertEquals(30, sum);
		
	}
}
