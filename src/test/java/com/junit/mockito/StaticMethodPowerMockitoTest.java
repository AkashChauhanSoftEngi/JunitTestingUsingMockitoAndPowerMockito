package com.junit.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticMethodClass.class)
public class StaticMethodPowerMockitoTest {
		
	@Before
	public void setUp(){
		
		mockStatic(StaticMethodClass.class);
		when(StaticMethodClass.ifCorrect(2)).thenReturn(true);
	}
	
	@Test
	public void testStaticMethod() {
		System.out.println("Inside Test case!");
		assertEquals(true, StaticMethodClass.ifCorrect(2));
	}
}
