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
public class WindowsLoopTest {



	@Test
	public void testMultipleWindows()  {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://en.wikipedia.org");
	
		driver.executeScript("window.open('http://google.ca');");
		driver.executeScript("window.open('http://en.wikipedia.org/wiki/The_Matrix');");
		
		// Keep track of current window
	    String currentWindow = driver.getWindowHandle();
	    
	    // Loop over all open windows/tabs looking for the right one
	    for( String handle : driver.getWindowHandles()) {
	        driver.switchTo().window( handle );
	        
	        // Stop once we find the window with the right title
	        if( driver.getTitle().contains( "The Matrix" ) ) {
	            break; //Stops the looping
	        }
	    }
	    
	    // Make sure we found the window
		assertTrue( driver.getTitle().contains( "The Matrix" ) );
	    
		driver.quit();
	}

}
