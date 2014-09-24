package io.github.jclarkin.junitbasics;

import org.junit.Test;
import static org.junit.Assert.*;

public class BasicScenarioDTest {

	@Test
	public void testTheScenario() {
		assertEquals( 5, 3 + 2);
	}

	@Test
	public void testTheBadScenario() {
		assertEquals( 5, 500);
	}
}
