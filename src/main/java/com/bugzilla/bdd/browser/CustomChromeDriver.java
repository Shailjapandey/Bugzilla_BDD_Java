package com.bugzilla.bdd.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomChromeDriver {
	
	public WebDriver LaunchChromeDriver(WebDriver webDriver) {
		System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\pandes15\\Documents\\Selenium\\com.cucumber.di\\src\\main\\resources\\com\\cucumber\\di\\driver\\chromedriver.exe");
		webDriver = new ChromeDriver();
		return webDriver;
	}

}
