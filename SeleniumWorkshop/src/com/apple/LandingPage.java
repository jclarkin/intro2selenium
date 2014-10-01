package com.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	private WebDriver driver;
	
	// Top Bar
	private By HOME = By.xpath("//*[contains(@class,'gh-tab-apple')]/a");
	private By STORE = By.xpath("//*[contains(@class,'gh-tab-store')]/a");
	private By MAC = By.xpath("//*[contains(@class,'gh-tab-mac')]/a");
	private By IPHONE = By.xpath("//*[contains(@class,'gh-tab-iphone')]/a");
	private By IPAD = By.xpath("//*[contains(@class,'gh-tab-ipad')]/a");
	private By SEARCH = By.id("gh-search-input");
	
	public LandingPage(WebDriver aDriver) {
		this.driver = aDriver;
	}

	public void goHome() {
		driver.findElement(HOME).click();
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

	public void goToIPad() {
		driver.findElement(IPAD).click();
	}

	public void searchFor(String something) {
		driver.findElement(SEARCH).sendKeys(something + "\n");
	}

}
