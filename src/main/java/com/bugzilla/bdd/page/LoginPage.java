package com.bugzilla.bdd.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase{
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(id="Bugzilla_login")
	public WebElement emailTxt;
	
	@FindBy(id= "Bugzilla_password")
	public WebElement passTxt;
	
	@FindBy(id= "log_in")
	public WebElement loginBtn;
	
	
	public PageBase login(String email, String password)
	{
		emailTxt.sendKeys(email);
		passTxt.sendKeys(password);
		
		
		WebDriverWait wait = getWait();
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		
		loginBtn.click();
		EnterBug enterBug = new EnterBug(driver);
		
		return enterBug;
		
	}
	

}
