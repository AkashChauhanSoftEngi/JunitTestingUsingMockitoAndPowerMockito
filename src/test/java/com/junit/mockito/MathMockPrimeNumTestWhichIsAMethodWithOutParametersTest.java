package com.junit.mockito;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

//Test a method that doesn't take any argument
public class MathMockPrimeNumTestWhichIsAMethodWithOutParametersTest {
	Math mathObj;

	@Before
	public void create() {
		mathObj = mock(Math.class); // Create Math Object
		when(mathObj.primeNumber()).thenReturn(5); // Configure it to return 5
													// as prime number
	}

	@Test
	public void test() {
		assertSame(5, mathObj.primeNumber());
	}

}
