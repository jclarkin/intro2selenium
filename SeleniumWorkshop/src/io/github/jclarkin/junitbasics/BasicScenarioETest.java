package io.github.jclarkin.junitbasics;

import org.junit.Test;
import static org.junit.Assert.*;

public class BasicScenarioETest {

	@Test
	public void testHappyPath() {
		assertEquals( 5, 3 + 2);
	}

	@Test
	public void testBrokenPath() {
		assertEquals( 5, 500);
	}
	
	@Test
	public void testCatastrophicPath() {
		throw new RuntimeException("There is no spoon");
	}
}
