Feature: Login Feature Scenario

  Background: 
    Given I have launched the application
    And I click on the Login Link

  Scenario: This scenario is to define the login happy path
    When I enter the correct username and passowrd
    And I click on the Login Button
    Then I should land on the home page

  @regression
  Scenario: This sceanrio is to define the failure path
    When I enter the incorrect username and passowrd
    And I click on the Login Button
    Then I should get the error message "Please enter a valid email address"

  @sanity
  Scenario: This sceanrio is to define the failure path
    When I enter the username as "abc@xyz" and Password as " 123567"
    And I click on the Login Button
    Then I should get the error message "Please fill in all required fields"

  Scenario Outline: This sceanrio is to define the failure path
    When I enter the username as "<UserName>" and passowrd as "<Password>"
    And I click on the Login Button
    Then I should get the error message "Please enter a valid email address"

    Examples: 
      | UserName | Password |
      | abc@xyz  |   123567 |
      | sds@xyz  |   198767 |
