Feature: Contact part of ISpeakBetter website
  @title
  Scenario: Check Contact page title
    Given I am on the Home page
    When I click Contact page
    Then Check Contact page title


  @contactUsMessage
  Scenario: Check 'Contact us' message part
    Given I go the Contact page
    When Input your name
    And input your email address
    And Select subject
    And Input your message
    Then I click Contact us button

  @scrollUp
  Scenario: Check scroll up part
    Given I am on the Contact page
    When I go all the way to the 'scroll up' section
    Then I click scroll up