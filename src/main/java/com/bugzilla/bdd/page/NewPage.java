package com.bugzilla.bdd.page;

import org.openqa.selenium.WebDriver;

public class NewPage extends PageBase {

	private WebDriver driver;
	public NewPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

}
