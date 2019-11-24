package com.bugzilla.bdd.page;

import org.openqa.selenium.WebDriver;

public class BrowserPage extends PageBase {
	private WebDriver driver;
	public BrowserPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

}
