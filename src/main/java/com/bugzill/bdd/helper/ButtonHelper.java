package com.bugzill.bdd.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonHelper {
	
	private static ButtonHelper buttonHelper;
	private static WebDriver wbDriver;
	
	private ButtonHelper(WebDriver driver)
	{
		wbDriver = driver;
	}

	public static ButtonHelper getInstance(WebDriver driver)
	{
		
		if(buttonHelper == null || wbDriver.hashCode() != driver.hashCode())
			buttonHelper = new ButtonHelper(driver);
	         return buttonHelper;	
	}
	
	public void click(By locator) {
		wbDriver.findElement(locator).click();
	}
}
