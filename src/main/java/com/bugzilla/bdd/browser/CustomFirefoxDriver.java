package com.bugzilla.bdd.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomFirefoxDriver{
		
	public  WebDriver LaunchFireFoxDriver(WebDriver webDriver){
		System.setProperty("webdriver.firefox.marionetter",
				"C:\\Users\\pandes15\\Documents\\Selenium\\cucumbertest\\src\\main\\java\\BrowserDriver\\geckodriver.exe");
		 webDriver = new FirefoxDriver();
		return webDriver;
		
}
}
