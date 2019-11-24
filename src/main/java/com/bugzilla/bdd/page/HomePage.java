package com.bugzilla.bdd.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bugzill.bdd.helper.ButtonHelper;

public class HomePage extends PageBase  {

	private WebDriver driver;
	private ButtonHelper buttonHelper;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

	@FindBy(id="enter_bug")
	public WebElement fileABuglink;
	
	@FindBy(id= "query")
	public WebElement serachLink;
	
	@FindBy(id="account")
	public WebElement openNewAccountLink;
	
	

	public PageBase NavigateToLoginPage()
	{
		LoginPage loginPage = new LoginPage(driver);
		WebDriverWait wait = getWait();
		wait.until(ExpectedConditions.visibilityOf(fileABuglink));
		
		fileABuglink.click();
		return loginPage;
	}
}
