package com.junit.mockito;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class MathMockMulTest {
	Math mathObj;

	@Before
	public void create() {
		mathObj = mock(Math.class);
		when(mathObj.mul(anyInt(), eq(0))).thenReturn(0); // Multiply any number
															// with zero. The
															// function should
															// return zero
	}

	@Test
	/**
	 * Test the Multiply function in math object return zero if one of the
	 * argument is zero
	 */
	public void test() {
		assertSame(mathObj.mul(1, 0), 0);
		assertSame(mathObj.mul(3, 0), 0);
	}

}
