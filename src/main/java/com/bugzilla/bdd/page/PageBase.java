package com.bugzilla.bdd.page;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bugzilla.bdd.browser.CustomChromeDriver;
import com.bugzilla.bdd.pagefactory.CustomPageFactory;
import com.bugzilla.bdd.pagefactory.PageName;
import com.bugzilla.bdd.util.DriverService;

public class PageBase {

	private WebDriver driver;
	private Properties pro;
	private CustomChromeDriver customChromeDriver;
	private WelcomePage welPage;
	private HomePage homePage;

	@FindBy(id = "login_link_top")
	WebElement loginLink;

	@FindBy(id = "Bugzilla_login_top")
	WebElement emailTxt;

	@FindBy(id = "Bugzilla_password_top")
	WebElement passTxt;

	@FindBy(id = "log_in_top")
	WebElement logBtn;

	@FindBy(xpath = "//*[contains(text(), 'Log')]")
	WebElement logOutlink;
	
	@FindBy(xpath = "//a[text()='New']")
	public WebElement newlink;

	public PageBase(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	protected WebDriverWait getWait() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		return wait;
	}

	public PageBase LoginTop(String email, String password) {
		welPage = new WelcomePage(driver);
		getWait().until(ExpectedConditions.elementToBeClickable(loginLink));
		loginLink.click();
		emailTxt.clear();
		emailTxt.sendKeys(email);
		passTxt.clear();
		passTxt.sendKeys(password);
		getWait().until(ExpectedConditions.elementToBeClickable(logBtn));
		logBtn.click();

		return welPage;
	}

	public PageBase LogoutTop() {
		homePage = new HomePage(driver);
		getWait().until(ExpectedConditions.elementToBeClickable(logOutlink));
		logOutlink.click();

		return homePage;

	}
	
	public PageBase navigateTo(WebDriver driver, PageName name, WebElement element)
	{
		WebDriverWait wait = getWait();
		wait.until(ExpectedConditions.visibilityOf(element));
		return CustomPageFactory.getInstance(driver, name);
	}

}
