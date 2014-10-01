package com.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IOSPage {

	private WebDriver driver;

	// Top Bar
	private By HOME = By.xpath("//*[contains(@class,'gh-tab-apple')]/a");
	private By SEARCH = By.id("gh-search-input");

	public IOSPage(WebDriver aDriver) throws Exception {
		this.driver = aDriver;
	}

	public void goHome() {
		driver.findElement(HOME).click();
	}

	public void searchFor(String something) {
		driver.findElement(SEARCH).sendKeys(something + "\n");
	}

}
