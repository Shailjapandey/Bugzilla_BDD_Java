package com.bugzill.bdd.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHelper {

	private DropdownHelper dropdownHelper;
	private WebDriver driver;

	public DropdownHelper(WebDriver driver) {

		this.driver = driver;
	}

	public DropdownHelper getInstance(WebDriver driver) {
		if (dropdownHelper == null || driver.hashCode() != driver.hashCode())
			dropdownHelper = new DropdownHelper(driver);
		return null;

	}

	public void selectByVisibleText(WebElement elm, String value) {
		Select select = new Select(elm);
		select.selectByValue(value);
	}

	public void selectByIndex(WebElement elm, int index) {
		Select select = new Select(elm);
		select.selectByIndex(index);
	}
}
