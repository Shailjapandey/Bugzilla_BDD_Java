Feature: Buzilla Login and Logout feature 

Background: 
	Given Bugzilla_I Launch the application 
	When Bugzilla_I Click on Login link at Top 
	Then Bugzilla_I Enter email address and Password and click on login btn 
	
Scenario: Verify user able to login and logout from Bugzilla 
	Given Bugzilla_I Verify the user at "Bugzilla – Welcome to Bugzilla" page
	And  Bugzilla_I click on logout 
	Then Bugzilla_I close the browser 
	
Scenario: Verify All links at the top menu are accessble 
	Given Bugzilla_I at bugzilla home page 
	Then Bugzilla_I click on New link 
	Then Bugzilla_I click on Browser link 
	Then Bugzilla_I click on Search link 
	And Bugzilla_I click on logout 
	Then Bugzilla_I close the browser 
	
	