package com.bugzilla.bdd.stepdfn;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.bugzilla.bdd.page.EnterBug;
import com.bugzilla.bdd.page.HomePage;
import com.bugzilla.bdd.page.LoginPage;
import com.bugzilla.bdd.page.SummaryPage;
import com.bugzilla.bdd.util.DriverService;
import com.bugzilla.bdd.util.TestSettings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateBug {
	
	private DriverService service;
	private TestSettings setting;
	private WebDriver driver;
	
	public CreateBug(DriverService service , TestSettings setting)
	{
		this.service = service;
		this.driver = service.getDriver();
		this.setting = setting;
	}
	
	@Given("^Bugzilla_I am at the Bugzilla home page$")
	public void bugzilla_i_am_at_the_Bugzilla_home_page() throws Throwable {
		driver.get(service.getReadConfig().getApplicationURI());
		setting.homepage = new HomePage(driver);
	  
	}

	@Then("^Bugzilla_I click on File a bug link and navigate to login page$")
	public void bugzilla_i_click_on_File_a_bug_link_and_navigate_to_login_page() throws Throwable {
		setting.loginPage = (LoginPage) setting.homepage.NavigateToLoginPage();
	}

	@Then("^Bugzilla_The title of login page should be \"([^\"]*)\"$")
	public void bugzilla_the_title_of_login_page_should_be(String arg1) throws Throwable {
		
		assertEquals(driver.getTitle(), arg1);
	   
	}

	@Then("^Bugzilla_I log into the application and navigate to enter bug page$")
	public void bugzilla_i_log_into_the_application_and_navigate_to_enter_bug_page() throws Throwable {
		setting.enterBug =(EnterBug) setting.loginPage.login(service.getReadConfig().getUsername(), service.getReadConfig().getPassword());
	  
	}

	@Then("^Bugzilla_I provide the details as component as \"([^\"]*)\" version as \"([^\"]*)\" severity as \"([^\"]*)\" hardware as \"([^\"]*)\"$")
	public void bugzilla_i_provide_the_details_as_component_as_version_as_severity_as_hardware_as(String comp, String ver, String os, String hard) throws Throwable {
	    setting.enterBug.provideDetails(comp, ver, os, hard);
	}

	@Then("^Bugzilla_I provide other details operating system as \"([^\"]*)\" summary as \"([^\"]*)\" and description as \"([^\"]*)\"$")
	public void bugzilla_i_provide_other_details_operating_system_as_summary_as_and_description_as(String sev, String summary, String desc) throws Throwable {
		setting.enterBug.provideOtherDetails(sev, summary, desc);
	}

	@Then("^Bugzilla_I click on submit bug button$")
	public void bugzilla_i_click_on_submit_bug_button() throws Throwable {
	  setting.summaryPage= (SummaryPage) setting.enterBug.submitBug();
	}

	@Then("^Bugzilla_I am at the summary page and I click the logout button$")
	public void bugzilla_i_am_at_the_summary_page_and_I_click_the_logout_button() throws Throwable {
	    
		setting.summaryPage.LogoutTop();
	}


}
