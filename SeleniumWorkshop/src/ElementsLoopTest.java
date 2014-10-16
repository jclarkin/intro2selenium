import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

@SuppressWarnings("unused")
public class ElementsLoopTest {

	WebDriver driver;

	@Before
	public void setupBrowser() throws Exception {
		driver = new FirefoxDriver();
	}

	@After
	public void tearDownBrowser() {
		driver.quit();
	}

	@Test
	public void testMultipleWindows() throws Exception {
		driver.get("http://www.wikipedia.org");

		for( WebElement lang : driver.findElements(By.className("central-featured-lang"))){
			WebElement title = lang.findElement(By.tagName("strong"));
			
			if(title.getText().equals("Polski")) {
				title.click();
			}
		}
		

		Thread.sleep(5000);
	}
}
