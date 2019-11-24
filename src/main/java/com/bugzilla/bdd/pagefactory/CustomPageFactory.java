package com.bugzilla.bdd.pagefactory;

import org.openqa.selenium.WebDriver;

import com.bugzilla.bdd.page.BrowserPage;
import com.bugzilla.bdd.page.EnterBug;
import com.bugzilla.bdd.page.HomePage;
import com.bugzilla.bdd.page.LoginPage;
import com.bugzilla.bdd.page.NewPage;
import com.bugzilla.bdd.page.PageBase;
import com.bugzilla.bdd.page.SerachPage;

public class CustomPageFactory {
	
	public static PageBase getInstance(WebDriver driver,PageName name)
	{
		switch(name) {
		case HomePage:
			return new HomePage(driver);
		case LoginPage:
			return new LoginPage(driver);
		case NewPage:
			return new NewPage(driver);
		case SerachPage:
			return new SerachPage(driver);
		case EnterBug:
			return new EnterBug(driver);
		case BrowserPage:
			return new BrowserPage(driver);
		
		default:
			throw new RuntimeException("Invalid Page Name");
		}
		
	
		
	}

}
