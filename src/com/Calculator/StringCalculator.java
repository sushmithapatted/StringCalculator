package com.Calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.hamcrest.CoreMatchers;

import com.main.Calculator.MainStringCalculator;

public class StringCalculator {

	@Test
	public void emptyString() {
		assertEquals(MainStringCalculator.emptyString(""),0);
	}
	
	@Test
	public void addSingleNum() {
		assertEquals(MainStringCalculator.emptyString("3"),3);
		assertEquals(MainStringCalculator.emptyString("42"),42);
	}
	
	
}
