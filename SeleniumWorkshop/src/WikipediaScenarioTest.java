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

@SuppressWarnings("unused")
public class WikipediaScenarioTest {

	WebDriver driver;

	@Before
	public void setupSafari() {
		// Setup the Browser
		driver = new SafariDriver();
		
		// Slow loading pages, always try and wait up to 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@After
	public void tearDownSafari() {
		driver.quit();
	}

	@Test
	public void testWikipedia() throws InterruptedException {
		driver.get("http://en.wikipedia.org");

		driver.findElement(By.id("searchInput")).sendKeys("Super Mario Bros");
		driver.findElement(By.id("searchButton")).click();
		
		driver.findElement(By.linkText("Nintendo")).click();
		
		String text = driver.findElement(By.id("bodyContent")).getAttribute("innerHTML");
		
		assertThat(text, containsString("Miyamoto"));
		
		Thread.sleep(5000);

	}

}
