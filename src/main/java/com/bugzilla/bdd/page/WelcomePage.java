package com.bugzilla.bdd.page;

import org.openqa.selenium.WebDriver;

public class WelcomePage extends PageBase{

	private WebDriver driver;
	public WelcomePage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		
	}

}
