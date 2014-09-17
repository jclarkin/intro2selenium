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
public class SeleniumSelectorsTest {

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
	public void testByXPath() throws InterruptedException {
		driver.get("http://bing.com");

		driver.findElement(By.xpath("//*/div/form/*/input[@id='sb_form_q']"))
				.sendKeys("Microsoft");

		Thread.sleep(5000);
	}

	@Test
	public void testById() throws InterruptedException {
		driver.get("http://en.wikipedia.org");

		driver.findElement(By.id("searchInput")).sendKeys("Super Mario Bros");
		driver.findElement(By.id("searchButton")).click();

		Thread.sleep(5000);
	}

	@Test
	public void testByPartialLinkText() throws InterruptedException {
		driver.get("http://youtube.com");

		driver.findElement(By.partialLinkText("Popular")).click();

		Thread.sleep(5000);
	}

	@Test
	public void testByClass() throws InterruptedException {
		driver.get("http://amazon.com");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(
				"Agile Testing");
		driver.findElement(By.className("nav-submit-input")).click();

		Thread.sleep(5000);
	}

	@Test
	public void testByName() throws InterruptedException {
		driver.get("http://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Put the lime");
		driver.findElement(By.name("q")).sendKeys(" in the coconut");

		driver.findElement(By.name("btnG")).click();

		Thread.sleep(5000);
	}

	@Test
	public void testByLinkText() throws InterruptedException {
		driver.get("http://www.ebay.com/");

		driver.findElement(By.linkText("Advanced")).click();
		driver.findElement(By.linkText("Find a member")).click();
		driver.findElement(By.linkText("Change the image")).click();
		driver.findElement(By.linkText("Change the image")).click();
		driver.findElement(By.linkText("Change the image")).click();
		driver.findElement(By.linkText("Change the image")).click();
		driver.findElement(By.linkText("My eBay")).click();

		Thread.sleep(5000);
	}

}
