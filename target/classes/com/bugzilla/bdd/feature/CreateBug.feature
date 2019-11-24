Feature: Create Bug in Bugzilla

Scenario: Bug Creation
    Given Bugzilla_I am at the Bugzilla home page
    Then Bugzilla_I click on File a bug link and navigate to login page
	And Bugzilla_The title of login page should be "Log in to Bugzilla1"
	Then Bugzilla_I log into the application and navigate to enter bug page
	And Bugzilla_I provide the details as component as "Unity300" version as "2" severity as "Windows" hardware as "All"
	And Bugzilla_I provide other details operating system as "normal" summary as "Bug Summary" and description as "Test Description"
	And Bugzilla_I click on submit bug button
	And Bugzilla_I am at the summary page and I click the logout button