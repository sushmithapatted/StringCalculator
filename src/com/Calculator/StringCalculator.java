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
		assertEquals(MainStringCalculator.addSingleNum("3"),3);
	}
}
