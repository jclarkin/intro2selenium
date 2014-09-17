package com.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IOSPage {

	private WebDriver driver;

	// Top Bar
	private By HOME = By.xpath("//*[@id='gn-apple']/a");
	private By SEARCH = By.id("sp-searchtext");

	public IOSPage(WebDriver aDriver) throws Exception {
		super();
		this.driver = aDriver;

		// Make sure we are on the right page
		if (!"Apple - iOS 7".equals(aDriver.getTitle())) {
			throw new IllegalStateException("This is not the iOS page: " + aDriver.getTitle());
		}
	}

	public LandingPage goHome() {
		driver.findElement(HOME).click();
		
		return new LandingPage(driver);
	}

	public void searchFor(String something) {
		driver.findElement(SEARCH).sendKeys(something + "\n");
	}

}
