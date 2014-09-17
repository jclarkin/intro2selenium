import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

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

import com.apple.IOSPage;
import com.apple.LandingPage;

@SuppressWarnings("unused")
public class PageObjectTest {

	WebDriver driver;

	@Before
	public void setupSafari() throws Exception {
		// Setup the Browser
		driver = new SafariDriver();

		// Slow loading pages, always try and wait up to 5 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDownSafari() {
		driver.quit();
	}

	@Test
	public void testAppleNavigation() throws InterruptedException {
		driver.get("http://apple.com");

		LandingPage landingPage = new LandingPage(driver);

		IOSPage iosPage = landingPage.goToIPad().ios();
		
		Thread.sleep(2000);
		
		landingPage = iosPage.goHome();
		
		landingPage.searchFor("Bill Gates");

		Thread.sleep(5000);
	}

}
