package com.apple.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	// Top Bar
	@FindBy(xpath = "//*[contains(@class,'gh-tab-apple')]/a")
	private WebElement HOME; 
	@FindBy(xpath = "//*[contains(@class,'gh-tab-store')]/a")
	private WebElement STORE;
	@FindBy(xpath = "//*[contains(@class,'gh-tab-mac')]/a")
	private WebElement MAC;
	@FindBy(xpath = "//*[contains(@class,'gh-tab-iphone')]/a")
	private WebElement IPHONE;
	@FindBy(xpath = "//*[contains(@class,'gh-tab-ipad')]/a")
	private WebElement IPAD;
	@FindBy(id = "gh-search-input")
	private WebElement SEARCH;
	
	public void goHome() {
		HOME.click();
	}

	public void goToStore() {
		STORE.click();
	}

	public void goToMac() {
		MAC.click();
	}

	public void goToIPhone() {
		IPHONE.click();
	}

	public void goToIPad() throws Exception {
		IPAD.click();

	}

	public void searchFor(String something) {
		SEARCH.sendKeys(something + "\n");
	}

}
