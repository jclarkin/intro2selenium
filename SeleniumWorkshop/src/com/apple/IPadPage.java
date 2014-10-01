package com.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IPadPage {

	private WebDriver driver;

	// Top Bar
	private By HOME = By.xpath("//*[contains(@class,'gh-tab-apple')]/a");
	private By STORE = By.xpath("//*[contains(@class,'gh-tab-store')]/a");
	private By MAC = By.xpath("//*[contains(@class,'gh-tab-mac')]/a");
	private By IPHONE = By.xpath("//*[contains(@class,'gh-tab-iphone')]/a");
	private By IPAD = By.xpath("//*[contains(@class,'gh-tab-ipad')]/a");
	private By SEARCH = By.id("gh-search-input");

	// Sub Categories
	private By ACCESSORIES = By.partialLinkText("Accessories");
	private By IOS = By.linkText("iOS 8");
	private By AIR = By.partialLinkText("iPad Air");

	public IPadPage(WebDriver aDriver) {
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

	public void accessories() {
		driver.findElement(ACCESSORIES).click();
	}

	public void ios() throws Exception {
		driver.findElement(IOS).click();
	}

	public void air() {
		driver.findElement(AIR).click();
	}

}
