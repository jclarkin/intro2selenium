package io.github.jclarkin.junitbasics;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicScenarioGTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setup for All Tests");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Teardown for All Tests");
	}

	@Test
	public void testA() {
		System.out.println("    Test A - Pass");
	}

	@Test
	public void testB() {
		System.out.println("    Test B - Fail");
		fail("Failing test");
	}

	@Test
	public void testC() {
		System.out.println("    Test C - Error");
		throw new RuntimeException("Arbitrary Error");
	}
}
