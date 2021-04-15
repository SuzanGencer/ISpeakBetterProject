Feature: I Speak Better Login Page

  @login
  Scenario: Valid Login
    Given I am on the login page
    When I enter valid username
    And I enter valid password
    And I click on the login button
    Then I see the home page


  @Invalid
  Scenario: InValid Login
    Given I am on the login page2
    When I enter invalid username
    And  I enter invalid password
    And I click on the login button 2
