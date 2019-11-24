$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/bugzilla/bdd/feature/CreateBug.feature");
formatter.feature({
  "line": 1,
  "name": "Create Bug in Bugzilla",
  "description": "",
  "id": "create-bug-in-bugzilla",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Bug Creation",
  "description": "",
  "id": "create-bug-in-bugzilla;bug-creation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Bugzilla_I am at the Bugzilla home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Bugzilla_I click on File a bug link and navigate to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Bugzilla_The title of login page should be \"Log in to Bugzilla1\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Bugzilla_I log into the application and navigate to enter bug page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Bugzilla_I provide the details as component as \"Unity300\" version as \"2\" severity as \"Windows\" hardware as \"All\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Bugzilla_I provide other details operating system as \"normal\" summary as \"Bug Summary\" and description as \"Test Description\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Bugzilla_I click on submit bug button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Bugzilla_I am at the summary page and I click the logout button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateBug.bugzilla_i_am_at_the_Bugzilla_home_page()"
});
formatter.result({
  "duration": 6829346146,
  "status": "passed"
});
formatter.match({
  "location": "CreateBug.bugzilla_i_click_on_File_a_bug_link_and_navigate_to_login_page()"
});
formatter.result({
  "duration": 1312823855,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log in to Bugzilla1",
      "offset": 44
    }
  ],
  "location": "CreateBug.bugzilla_the_title_of_login_page_should_be(String)"
});
formatter.result({
  "duration": 14334666,
  "error_message": "java.lang.AssertionError: expected [Log in to Bugzilla1] but found [Log in to Bugzilla]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:135)\r\n\tat org.testng.Assert.assertEquals(Assert.java:116)\r\n\tat org.testng.Assert.assertEquals(Assert.java:190)\r\n\tat org.testng.Assert.assertEquals(Assert.java:200)\r\n\tat com.bugzilla.bdd.stepdfn.CreateBug.bugzilla_the_title_of_login_page_should_be(CreateBug.java:45)\r\n\tat ✽.And Bugzilla_The title of login page should be \"Log in to Bugzilla1\"(src/main/java/com/bugzilla/bdd/feature/CreateBug.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateBug.bugzilla_i_log_into_the_application_and_navigate_to_enter_bug_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Unity300",
      "offset": 48
    },
    {
      "val": "2",
      "offset": 70
    },
    {
      "val": "Windows",
      "offset": 86
    },
    {
      "val": "All",
      "offset": 108
    }
  ],
  "location": "CreateBug.bugzilla_i_provide_the_details_as_component_as_version_as_severity_as_hardware_as(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "normal",
      "offset": 54
    },
    {
      "val": "Bug Summary",
      "offset": 74
    },
    {
      "val": "Test Description",
      "offset": 107
    }
  ],
  "location": "CreateBug.bugzilla_i_provide_other_details_operating_system_as_summary_as_and_description_as(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateBug.bugzilla_i_click_on_submit_bug_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateBug.bugzilla_i_am_at_the_summary_page_and_I_click_the_logout_button()"
});
formatter.result({
  "status": "skipped"
});
});