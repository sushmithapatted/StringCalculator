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
	
	@Test
	public void addTwoNum() {
		assertEquals(MainStringCalculator.emptyString("3,3"),6);
		assertEquals(MainStringCalculator.emptyString("42,8"),50);
	}
	
	@Test
	public void addManyNum() {
		assertEquals(MainStringCalculator.emptyString("3,3,7,8,0"),21);
		assertEquals(MainStringCalculator.emptyString("42,8,89,1,99"),239);
	}
	
	@Test
	public void addNumsWithNewLines() {
		assertEquals(MainStringCalculator.emptyString("3\n3,7\n8,0"),21);
		assertEquals(MainStringCalculator.emptyString("42\n8,89,1\n99"),239);
		assertEquals(MainStringCalculator.emptyString("1\n2,3"),6);
	}
	
	@Test
	public void supportDiffDelimeters() {
		assertEquals(MainStringCalculator.emptyString("//;\\n1;2"),3);
	}
}
