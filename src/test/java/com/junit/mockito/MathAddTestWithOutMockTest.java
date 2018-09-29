package com.junit.mockito;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Test the add method of Math object
 */
public class MathAddTestWithOutMockTest {

	Math mathObj;

	@Mock
	Math mathObjTwo;

	@Before
	/* Create Math object before you use them */
	public void create() {
		/* One way */
		mathObj = mock(Math.class);// create a math mock object
		when(mathObj.add(1, 2)).thenReturn(3); // Configure it to return 3 when
												// arguments passed are 1,2
		/* Another way */
		MockitoAnnotations.initMocks(this);
		when(mathObjTwo.add(1, 2)).thenReturn(3);
	}

	@Test
	public void testOne() {
		assertSame(3, mathObj.add(1, 2)); // Assert that math object return 3
	}

	@Test
	public void testTwo() {
		assertSame(3, mathObjTwo.add(1, 2)); // Assert that math object return 3
	}

}
