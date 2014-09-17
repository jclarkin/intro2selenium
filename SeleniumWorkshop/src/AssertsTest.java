import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

@SuppressWarnings("unused")
public class AssertsTest {

	@Test
	public void testNumbersEqual() {

		assertEquals(27, 3 * 3 * 3);

		assertThat(27, is(equalTo(3 * 3 * 3)));
	}

	@Test
	public void testNumbersGreaterThan() {

		assertTrue(100 > 1);

		assertThat(27, is(greaterThan(10)));
	}

	@Test
	public void testDifferent() {

		assertNotEquals("trees", "Trees");

		assertThat("trees", is(not(equalTo("Trees"))));
	}

	@Test
	public void testTextContains() {
		assertThat("Howsnowbrowncow", containsString("snow"));
	}

}
