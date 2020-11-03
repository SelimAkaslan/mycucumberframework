@fhclogin  @first
Feature: Login feature
  Scenario: TC01_kullanici gecerli kimlik bilgileri ile giris yapar
    Given user is on the fhctriplogin page
    And user enters valid username
    And user enters  valid password
    And user clicks login button
    Then verify login is successfull