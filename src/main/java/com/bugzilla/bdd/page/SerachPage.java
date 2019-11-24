package com.bugzilla.bdd.page;

import org.openqa.selenium.WebDriver;

public class SerachPage extends PageBase {

	private WebDriver driver;
	public SerachPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}
