package com.revature.day5.testing;

import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTests {

	@Mock
	private Calculator calc;

	@InjectMocks
	private final MathApplication ma = new MathApplication();

	@BeforeClass
	public static void beforeAllTests() {
		System.out.println("this will run once, before any other tests have run");
	}

	@Before
	public void beforeEachTest() {
		System.out.println("this will run before each and every test");
	}

	@Test
	public void myTest() {
		when(calc.add(1, 1)).thenReturn(2d);
		when(calc.multiply(2, 2)).thenReturn(4d);
		double result = ma.myAdvancedCalculation(1, 1, 2);
		Assert.assertEquals(4, result, 0.00000001);
	}

	@Test
	public void myTest2() {
		when(calc.add(3, 8)).thenReturn(11d);
		when(calc.multiply(11, 7)).thenReturn(77d);
		double result = ma.myAdvancedCalculation(3, 8, 7);
		Assert.assertEquals(77, result, 0.00000001);
	}

	@After
	public void afterEachTest() {
		System.out.println("this will run after each and every test");
	}

	@AfterClass
	public static void afterAllTests() {
		System.out.println("this will run once, after all tests have run");
	}
}
