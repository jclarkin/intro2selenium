import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

@SuppressWarnings("unused")
public class WebDriverTypeTest {

	@Test
	public void testFirefox() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.quit();
	}

	@Test
	public void testSafari() throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("http://google.com");
		
		driver.quit();
	}

	@Test
	public void testChromeWin32() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", new File(
				"lib/chromedriver.exe").getAbsolutePath());

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		driver.quit();
	}

	@Test
	public void testChromeOsx() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", new File(
				"lib/osx_chromedriver").getAbsolutePath());

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		driver.quit();
	}

	@Test
	public void testChromeLinux32() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", new File(
				"lib/nix32_chromedriver").getAbsolutePath());

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		driver.quit();
	}


	@Test
	public void testChromeLinux64() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", new File(
				"lib/nix64_chromedriver").getAbsolutePath());

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		driver.quit();
	}

	@Test
	public void testInternetExplorer() throws InterruptedException {
		System.setProperty("webdriver.ie.driver", new File(
				"lib/IEDriverServer.exe").getAbsolutePath());

		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		
		driver.quit();
	}

}
