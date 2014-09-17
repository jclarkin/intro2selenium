package com.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	private WebDriver driver;
	
	// Top Bar
	private By HOME = By.xpath("//*[@id='gn-apple']/a");
	private By STORE = By.xpath("//*[@id='gn-store']/a");
	private By MAC = By.xpath("//*[@id='gn-mac']/a");
	private By IPHONE = By.xpath("//*[@id='gn-iphone']/a");
	private By IPAD = By.xpath("//*[@id='gn-ipad']/a");
	private By SEARCH = By.id("sp-searchtext");
	
	public LandingPage(WebDriver aDriver) {
		super();
		this.driver = aDriver;

		// Make sure we are on the right page
		if (!"Apple".equals(aDriver.getTitle())) {
			throw new IllegalStateException("This is not the landing page: " + aDriver.getTitle());
		}
	}

	public LandingPage goHome() {
		driver.findElement(HOME).click();
		
		return new LandingPage(driver);
	}

	public void goToStore() {
		driver.findElement(STORE).click();
	}

	public void goToMac() {
		driver.findElement(MAC).click();
	}

	public void goToIPhone() {
		driver.findElement(IPHONE).click();
	}

	public IPadPage goToIPad() throws Exception {
		driver.findElement(IPAD).click();
		
		return new IPadPage(driver);
	}

	public void searchFor(String something) {
		driver.findElement(SEARCH).sendKeys(something + "\n");
	}

}
