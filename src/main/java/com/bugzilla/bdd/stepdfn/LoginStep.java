package com.bugzilla.bdd.stepdfn;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bugzilla.bdd.page.HomePage;
import com.bugzilla.bdd.page.LoginPage;
import com.bugzilla.bdd.page.NewPage;
import com.bugzilla.bdd.page.PageBase;
import com.bugzilla.bdd.page.WelcomePage;
import com.bugzilla.bdd.pagefactory.PageName;
import com.bugzilla.bdd.util.DriverService;
import com.bugzilla.bdd.util.ReadConfigProperties;
import com.bugzilla.bdd.util.TestSettings;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	private WebDriver driver;
	private ReadConfigProperties readConfig;
	private HomePage homePage;
	private LoginPage loginPage;
	private NewPage newPage;
	private WelcomePage welcomePage;
	private DriverService services;
	private TestSettings setting;

	public LoginStep(DriverService services, TestSettings setting) {
		this.services = services;
		this.driver = services.getDriver();
		this.setting = setting;

	}

	@Given("^Bugzilla_I Launch the application$")
	public void bugzilla_i_Launch_the_application() throws Throwable {
		readConfig = new ReadConfigProperties();
		driver.get(readConfig.getApplicationURI());
		setting.homepage = new HomePage(driver);

	}

	@When("^Bugzilla_I Click on Login link at Top$")
	public void bugzilla_i_Click_on_Login_link_at_Top() throws Throwable {

	}

	@Then("^Bugzilla_I Enter email address and Password and click on login btn$")
	public void bugzilla_i_Enter_email_address_and_Password_and_click_on_login_btn() throws Throwable {

		String email = readConfig.getUsername();
		String password = readConfig.getPassword();
		setting.homepage.LoginTop(email, password);

	}
	
	@Given("^Bugzilla_I Verify the user at \"([^\"]*)\" page$")
	public void verify_the_user_logged_in(String arg1) throws Throwable {
		
		String actual = driver.findElement(By.id("title")).getText();
		assertEquals(actual, arg1);
	}
	
	@Given("^Bugzilla_I at bugzilla home page$")
	public void bugzilla_i_at_bugzilla_home_page() throws Throwable {
		//welcomePage = setting.navigateTo(driver, PageName.NewPage, welcomePage.newlink);
		setting.homepage.newlink.click();
	
		//welcomePage.nagigateTo(driver, PageName.NewPage, welcomePage.newlink);
	}
	

	@Then("^Bugzilla_I click on New link$")
	public void bugzilla_i_click_on_New_link() throws Throwable {
	   
	}

	@Then("^Bugzilla_I click on Browser link$")
	public void bugzilla_i_click_on_Browser_link() throws Throwable {
	    
	}

	@Then("^Bugzilla_I click on Search link$")
	public void bugzilla_i_click_on_Search_link() throws Throwable {
	   
	}
	
	

	@And("^Bugzilla_I click on logout$")
	public void bugzilla_i_Click_logout() throws Throwable {
		setting.homepage.LogoutTop();

	}

	@Then("^Bugzilla_I close the browser$")
	public void bugzilla_i_Close_browser() throws Throwable {
		driver.quit();

	}
}
