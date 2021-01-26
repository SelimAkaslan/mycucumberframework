$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/fhctrip_login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@fhclogin"
    },
    {
      "name": "@first"
    }
  ]
});
formatter.scenario({
  "name": "TC01_kullanici gecerli kimlik bilgileri ile giris yapar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fhclogin"
    },
    {
      "name": "@first"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the fhctriplogin page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.FhcTripLoginStepDefinitions.user_is_on_the_fhctriplogin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcTripLoginStepDefinitions.user_enters_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters  valid password",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcTripLoginStepDefinitions.user_enters_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcTripLoginStepDefinitions.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login is successfull",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.FhcTripLoginStepDefinitions.verify_login_is_successfull()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:87)\n\tat org.junit.Assert.assertTrue(Assert.java:42)\n\tat org.junit.Assert.assertTrue(Assert.java:53)\n\tat stepdefinitions.FhcTripLoginStepDefinitions.verify_login_is_successfull(FhcTripLoginStepDefinitions.java:29)\n\tat ✽.verify login is successfull(file:///Users/buse/IdeaProjects/mycucumberframework/src/test/resources/features/fhctrip_login.feature:8)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});