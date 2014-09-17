import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitMethodsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setup for All Tests");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Teardown for All Tests");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("  Setup for One Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("  Teardown for One Test");
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
