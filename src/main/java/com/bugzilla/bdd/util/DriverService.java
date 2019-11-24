package com.bugzilla.bdd.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.bugzill.bdd.helper.ButtonHelper;
import com.bugzilla.bdd.browser.CustomChromeDriver;

public class DriverService {

	private WebDriver driver;
	private ReadConfigProperties readConfig;
	private CustomChromeDriver customChromeDriver;
	private ButtonHelper buttonHelper;

	public ButtonHelper getButtonHelper() {
		return buttonHelper;
	}

	public DriverService() {
		launchBroswer();
	}

	public ReadConfigProperties getReadConfig() {
		return readConfig;
	}

	private void launchBroswer() {

		driver = getBrowserDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		buttonHelper = ButtonHelper.getInstance(driver);

	}

	private WebDriver getBrowserDriver() {
		readConfig = new ReadConfigProperties();
		String browserName = readConfig.getBrowser();

		if (browserName.equals("chrome")) {
			customChromeDriver = new CustomChromeDriver();
			driver = customChromeDriver.LaunchChromeDriver(driver);
		}

		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
