package com.bugzilla.bdd.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bugzill.bdd.helper.DropdownHelper;

public class EnterBug extends PageBase {
	private WebDriver driver;
	DropdownHelper helper = new DropdownHelper(driver);

	@FindBy(id = "component")
	WebElement compoment;

	@FindBy(id = "version")
	WebElement version;

	@FindBy(id = "bug_severity")
	WebElement severity;

	@FindBy(id = "op_sys")
	WebElement os_sys;

	@FindBy(id = "rep_platform")
	WebElement hardware;

	@FindBy(id = "priority")
	WebElement priority;

	@FindBy(id = "assigned_to")
	WebElement assigned_to;

	@FindBy(id = "short_desc")
	WebElement short_desc;

	@FindBy(id = "comment")
	WebElement comment;

	@FindBy(id = "commit")
	WebElement commit;

	public EnterBug(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	public void provideDetails(String comp, String ver, String os, String hard) {

		helper.selectByVisibleText(compoment, comp);
		helper.selectByVisibleText(version, ver);
		helper.selectByVisibleText(hardware, hard);
		helper.selectByVisibleText(os_sys, os);

	}

	public void provideOtherDetails(String sev, String summary, String desc) {

		helper.selectByVisibleText(severity, sev);
		short_desc.sendKeys(summary);
		comment.sendKeys(desc);

	}
	
	public PageBase submitBug() {
		
		WebDriverWait wait = getWait();
		wait.until(ExpectedConditions.elementToBeClickable(commit));
		commit.click();
		SummaryPage summaryPage = new SummaryPage(driver);
		return summaryPage;
	}

}
