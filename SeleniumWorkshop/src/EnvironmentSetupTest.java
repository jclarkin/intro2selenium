import static org.junit.Assert.*;

import org.junit.Test;


public class EnvironmentSetupTest {

	@Test
	public void testPass() {
		assertEquals(1, 1);
	}

	
	@Test
	public void testFail() {
		fail("Not yet implemented");
	}

	
	@Test
	public void testError() {
		throw new RuntimeException("Unhandled error");
	}

}
