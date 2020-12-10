package com.Calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.hamcrest.CoreMatchers;

import com.main.Calculator.MainStringCalculator;

public class StringCalculator {

	@Test
	public void sum0() {
		assertEquals(MainStringCalculator.sum(""),0);
	}
}
