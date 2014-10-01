package com.apple.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IOSPage {

	// Top Bar
	@FindBy(xpath = "//*[contains(@class,'gh-tab-apple')]/a")
	private WebElement HOME; 
	
	@FindBy(id = "gh-search-input")
	private WebElement SEARCH;

	public void goHome() {
		HOME.click();
	}

	public void searchFor(String something) {
		SEARCH.sendKeys(something + "\n");
	}

}
