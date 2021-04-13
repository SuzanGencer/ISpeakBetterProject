Feature: Chat part of ISpeakBetter website
  @chat
  Scenario: Check Chat part
    Given I am on the Home page
    When I click Chat button
    And Input your name in chat
    And Input your email address in chat
    And Type your message in chat
    Then I click start chat