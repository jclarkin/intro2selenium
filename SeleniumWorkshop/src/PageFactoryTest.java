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
import org.openqa.selenium.support.PageFactory;

import com.apple.factory.IOSPage;
import com.apple.factory.IPadPage;
import com.apple.factory.LandingPage;

@SuppressWarnings("unused")
public class PageFactoryTest {

	WebDriver driver;

	@Before
	public void setupBrowser() throws Exception {
		// Setup the Browser
		driver = new FirefoxDriver();

		// Slow loading pages, always try and wait up to 5 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDownBrowser() {
		driver.quit();
	}

	@Test
	public void testAppleNavigation() throws Exception {
		driver.get("http://apple.com");

		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		landingPage.goToIPad();
		
		IPadPage iPadPage = PageFactory.initElements(driver, IPadPage.class );
		iPadPage.ios();
		
		IOSPage iosPage = PageFactory.initElements(driver, IOSPage.class );
		Thread.sleep(2000);
		iosPage.goHome();
		
		landingPage = PageFactory.initElements(driver, LandingPage.class );
		landingPage.searchFor("Bill Gates");

		Thread.sleep(5000);
	}

}
