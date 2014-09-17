import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Theories.class)
public class DataPointsTest {

	static WebDriver driver;

	@DataPoints
	public static String[] urls() {
		return new String[] { "http://google.com", "http://yahoo.com",
				"http://bing.com" };
	}

	@BeforeClass
	public static void setUpDriver() {
		System.setProperty("webdriver.chrome.driver", new File(
				"lib/chromedriver.exe").getAbsolutePath());

		driver = new ChromeDriver();

	}

	@AfterClass
	public static void tearDownDriver() {
		driver.quit();
	}

	@Theory
	public void testUrl(String url) throws Exception {
		driver.get(url);

		Thread.sleep(2000);
	}

}
