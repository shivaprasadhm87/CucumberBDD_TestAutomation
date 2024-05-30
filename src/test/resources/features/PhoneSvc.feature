Feature: Phone Svc
  As a user, I want to get phone details so that I can review my data

  @Smoke
  Scenario: Verify phone details are displayed in the response
    Given the "phone_svc" endpoint is available
    When "phone_svc" is called
    Then status 200 is displayed in the response
    And phone names starting with "Apple" is displayed in the response
    And phone with lowest cost is displayed
    And phone id is not null
